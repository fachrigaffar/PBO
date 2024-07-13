package JavaGame;

import java.sql.*;
import java.util.Scanner;

public class Game {
    static Scanner scanner = new Scanner(System.in);

    static Hero hero;
    public static int chapter = 1;
    public static int score = 0;
    public static long startTime;
    public static long endTime;
    public static boolean isAlive;
    public static Connection conn;

    private static void connectToDatabase() {
        try {
            String url = "jdbc:mysql://127.0.0.1/game";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void closeDatabaseConnection() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void heading(String title){
        System.out.println(title);
    }

    public static void pembatas(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    public static void startGame(){
        connectToDatabase();
        String nama;
        // Input nama hero
        do{
            heading("Masukkan nama hero: ");
            nama = scanner.next();
        }while(nama.isEmpty());
        
        hero = new Hero(nama); // Create new hero
        pembatas(40);
        heading("Selamat Datang di Goblin Village " + hero.getNama() + " !");
        pembatas(40);
        
        
        startTime = System.currentTimeMillis(); // Get current time in milliseconds
        isAlive = true;

        // Battle
        gameLoop();
        closeDatabaseConnection();
    }

    public static void printMenu(){
        heading("MAIN MENU");
        System.out.print("Pilih Aksi: \n");
        System.out.println("1. Battle" + " | Chapter: " + chapter);
        System.out.println("2. Hero Info");
        System.out.println("3. Exit Game");
    }

    public static void heroInfo(){
        heading("HERO INFO");
        pembatas(30);
        System.out.println(hero.nama + " | HP: " + hero.hp + "/" + hero.maxHp + " | EXP: " + hero.exp + " |");
        System.out.println("Score kamu: " + score);
        pembatas(30);
    }

    public static void gameLoop(){
        while (isAlive) {
            printMenu();
            int choice = scanner.nextInt();
            if(choice == 1){
                if(chapter % 3 == 0){
                    heading("BOSS BATTLE");
                    System.out.println("Lanjut ke Boss Battle? (1. Yes | 2. No)");
                    int choiceBoss = scanner.nextInt();
                    if(choiceBoss == 1){
                        Boss boss = new Boss("Goblin King");
                        bossBattle(boss);
                    }
                    else{
                    
                        Mob enemy = new Mob("Golem");
                        battle(enemy);
                    }
                }
                else{
                    Mob enemy = new Mob("Golem");
                    battle(enemy);
                }
            }else if(choice == 2){
                heroInfo();
            }else{
                endGame("lose");
                break;
            }
        }
    }

    public static void battle(Mob enemy){
        while(true){
            heading(hero.nama + " HP: " + hero.hp + "/" + hero.maxHp);
            heading(enemy.nama + " HP: " + enemy.hp + "/" + enemy.maxHp);
            System.out.println("Pilih Aksi: ");
            pembatas(40);
            System.out.println("1. Attack");
            System.out.println("2. Defend");
            System.out.println("3. Run");
            pembatas(40);
            int choice = scanner.nextInt();
            if(choice == 1){
                int damage = hero.attack() - enemy.defend();
                enemy.hp -= damage;
                System.out.println(hero.nama + " menyerang " + enemy.nama + " sebesar " + damage + " damage!");
                if(enemy.hp <= 0){
                    System.out.println(hero.nama + " berhasil mengalahkan " + enemy.nama + "!");
                    enemy.exp = 50;
                    System.out.println(hero.nama + " mendapatkan " + enemy.exp + " EXP!");
                    hero.exp += enemy.exp;
                    hero.hp += 10;  // heal 10 HP setelah membunuh musuh
                    chapter++;
                    score += 100;
                    levelUp();
                    break;
                }

                int enemyDamage = enemy.attack() - hero.defend();
                hero.hp -= enemyDamage;
                System.out.println(enemy.nama + " menyerang " + hero.nama + " sebesar " + enemyDamage + " damage!");
                if(hero.hp <= 0){
                    System.out.println(hero.nama + " kalah dalam pertarungan!");
                    System.out.println("Game Over!");
                    endGame("lose");
                    break;
                }
            }
            else if(choice == 2){
                int enemyDamage = enemy.attack() - hero.defend();
                hero.hp -= enemyDamage;
                System.out.println(enemy.nama + " menyerang " + hero.nama + " sebesar " + enemyDamage + " damage!");
                if(hero.hp <= 0){
                    System.out.println(hero.nama + " kalah dalam pertarungan!");
                    System.out.println("Game Over!");
                    endGame("lose");
                    break;
                }
            }
            else{
                System.out.println("Kamu berhasil melarikan diri dari pertarungan!");
                break;
            }
        }
    }

    public static void levelUp(){
        if(hero.exp >= 100){
            hero.maxHp += 50;
            hero.baseAttack += 10;
            hero.hp += 20;
            hero.exp = 0;
            System.out.println(hero.nama + " naik level!");
            System.out.println(hero.nama + " memulihkan 20 HP dan menaikkan statnya!");
        }
        else if(hero.exp >= 200){
            hero.maxHp += 60;
            hero.baseAttack += 15;
            hero.hp += 30;
            hero.exp = 0;
            System.out.println(hero.nama + " naik level!");
            System.out.println(hero.nama + " memulihkan 30 HP dan menaikkan statnya!");
        }else{
            hero.maxHp += 65;
            hero.baseAttack += 20;
            hero.hp += 40;
            hero.exp = 0;
            System.out.println(hero.nama + " naik level!");
            System.out.println(hero.nama + " memulihkan 40 HP dan menaikkan statnya!");
        }
    }

    public static void bossBattle(Boss boss){
        while(true){
            heading(hero.nama + " HP: " + hero.hp + "/" + hero.maxHp);
            heading(boss.nama + " HP: " + boss.hp + "/" + boss.maxHp);
            System.out.println("Pilih Aksi: ");
            pembatas(40);
            System.out.println("1. Attack");
            System.out.println("2. Defend");
            System.out.println("3. Run");
            pembatas(40);
            int choice = scanner.nextInt();
            if(choice == 1){
                int damage = hero.attack() - boss.defend();
                boss.hp -= damage;
                System.out.println(hero.nama + " menyerang " + boss.nama + " sebesar " + damage + " damage!");
                if(boss.hp <= 0){
                    System.out.println(hero.nama + " berhasil mengalahkan " + boss.nama + "!");
                    boss.exp = 100;
                    System.out.println(hero.nama + " mendapatkan " + boss.exp + " EXP!");
                    hero.exp += boss.exp;
                    hero.hp += 20;  // heal 20 HP setelah membunuh boss
                    chapter++;
                    score += 500;
                    levelUp();
                    endGame("win");
                    break;
                }

                int bossDamage = boss.attack() - hero.defend();
                hero.hp -= bossDamage;
                System.out.println(boss.nama + " menyerang " + hero.nama + " sebesar " + bossDamage + " damage!");
                if(hero.hp <= 0){
                    System.out.println(hero.nama + " kalah dalam pertarungan!");
                    System.out.println("Game Over!");
                    endGame("lose");
                    break;
                }
            }
        }
    }

    public static void endGame(String status){
        isAlive = false;
   
        endTime = System.currentTimeMillis(); // Get current time in milliseconds
        long durationMillis = endTime - startTime;
        long durationSeconds = durationMillis / 1000;
        long minutes = (durationSeconds % 3600) / 60;
        long seconds = durationSeconds % 60;
        String duration = String.format("%02d menit %02d detik", minutes, seconds);

        pembatas(40);
        System.out.println("Status: " + status + " | Score kamu: " + score);
        System.out.println("Kamu bermain selama: " + duration);
        pembatas(40);

        saveGameResult(status, duration);
    }

    public static void saveGameResult(String status, String durasi) {
        try {
            String query = "INSERT INTO game_results (nama_hero, score, status, durasi) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, hero.getNama());
            statement.setInt(2, score);
            statement.setString(3, status);
            statement.setString(4, durasi);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
