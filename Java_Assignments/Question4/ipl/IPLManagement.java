package Question4.ipl;

import java.util.*;

public class IPLManagement {
    static ArrayList<Team> teams = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n1.Add Team\n2.Delete Team\n3.Delete Player");
            System.out.println("4.Display Batsman\n5.Display by Speciality");
            System.out.println("6.Add Player\n7.Modify Coach\n8.Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addTeam();
                    break;

                case 2:
                    System.out.print("Enter team id: ");
                    int tid = sc.nextInt();
                    teams.removeIf(t -> t.getTeamId() == tid);
                    break;

                case 3:
                    System.out.print("Enter team id: ");
                    tid = sc.nextInt();
                    System.out.print("Enter player id: ");
                    int pid = sc.nextInt();

                    for (Team t : teams) {
                        if (t.getTeamId() == tid) {
                            t.removePlayer(pid);
                        }
                    }
                    break;

                case 4:
                    for (Team t : teams) {
                        for (Player p : t.getPlayers()) {
                            if (p.getSpeciality().equalsIgnoreCase("batsman")) {
                                System.out.println(p);
                            }
                        }
                    }
                    break;

                case 5:
                    System.out.print("Enter speciality: ");
                    String sp = sc.next();

                    for (Team t : teams) {
                        for (Player p : t.getPlayers()) {
                            if (p.getSpeciality().equalsIgnoreCase(sp)) {
                                System.out.println(p);
                            }
                        }
                    }
                    break;

                case 6:
                    System.out.print("Enter team id: ");
                    tid = sc.nextInt();

                    for (Team t : teams) {
                        if (t.getTeamId() == tid) {
                            System.out.print("Enter player id, name, speciality: ");
                            Player p = new Player(sc.nextInt(), sc.next(), sc.next());
                            t.addPlayer(p);
                        }
                    }
                    break;

                case 7:
                    System.out.print("Enter team id: ");
                    tid = sc.nextInt();

                    for (Team t : teams) {
                        if (t.getTeamId() == tid) {
                            System.out.print("Enter new coach: ");
                            t.setCoachName(sc.next());
                        }
                    }
                    break;

            }
        } while (choice != 8);
    }

    static void addTeam() {
        System.out.print("Enter team id, name, coach: ");
        Team t = new Team(sc.nextInt(), sc.next(), sc.next());
        teams.add(t);
    }
}