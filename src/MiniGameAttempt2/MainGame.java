//package MiniGameAttempt2;
//
//import java.io.File;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class MainGame {
//
//    static ArrayList<NavigateRooms> roomsArrayList = new ArrayList();
//
//    public static void main(String[] args) {
//        //Object with reachable methods
//        NavigateRooms navigateRooms = null;
//        Room room = null;
//        Player player = null;
//
//        //---1-----------------------------------------------------------------------------------------------------------
//        //Reading Rooms text file
//        File fileRooms = new File("src/MiniGameAttempt2/Rooms.txt");
//        Scanner scanner = null;
//
//        //If file exists then continue
//        try {
//            scanner = new Scanner(fileRooms);
//        } catch (Exception e) {
//            System.out.println("Invalid File");
//            System.exit(0);
//        }
//        //---1-----------------------------------------------------------------------------------------------------------
//
//
//        //---2-----------------------------------------------------------------------------------------------------------
//        try {
//            while (scanner.hasNextLine()){
//
//                //Room Location Number
//                int roomLocation = scanner.nextInt();
//                scanner.nextLine();
//
//                //Room Name
//                String roomName = scanner.nextLine();
//
//                //Reading three line description
//                String roomDescriptionLine1 = scanner.nextLine();
//                String roomDescriptionLine2 = scanner.nextLine();
//                String roomDescriptionLine3 = scanner.nextLine();
//                String roomDescriptionOneLine = roomDescriptionLine1 + "\n" + roomDescriptionLine2 + "\n" + roomDescriptionLine3;
//
//                //Read dashed line -------
//                scanner.nextLine();
//
//                //Reading Directions and correlating numbers
//                String N = scanner.next();
//                String N1num = scanner.next();
//                int NnumberMain = Integer.parseInt(N1num);
//
//                String E = scanner.next();
//                String E2num = scanner.next();
//                int EnumberMain = Integer.parseInt(E2num);
//
//                String S = scanner.next();
//                String S3num = scanner.next();
//                int SnumberMain = Integer.parseInt(S3num);
//
//                String W = scanner.next();
//                String W4num = scanner.next();
//                int WnumberMain = Integer.parseInt(W4num);
//
//                scanner.nextLine();
//
//
//                //Read dashed line -------
//                scanner.nextLine();
//
//                //added to object
////                room = new Room(roomName, roomDescriptionOneLine, roomLocation);
////                navigateRooms = new NavigateRooms(roomName, roomDescriptionOneLine, roomLocation,N, E, S, W, NnumberMain, EnumberMain, SnumberMain, WnumberMain);
////                roomsArrayList.add(navigateRooms);
//
//
//            }
//        }
//        catch (Exception e){
//
//            System.out.println("Something went wrong trying to read the Game!");
//
//        }
////        player = new Player(room.setRoomLocation(1), , roomDescriptionOneLine, );
//
////        Actor a = new Actor(navigateRooms.setRoomNumber(1), navigateRooms.getLocation(), navigateRooms.getRoomDescription());
//
//        //---2-----------------------------------------------------------------------------------------------------------
//
//
//        //---3-----------------------------------------------------------------------------------------------------------
//            try {
//
//                Scanner input = new Scanner(System.in);
//                //Intro Question
//                System.out.println("Would you like to play Adventure game demo Y/N: ");
//                System.out.print("> ");
//                String yesOrNo = input.nextLine();
//                System.out.print("\n");
//
//                //prints out intro room
//                NavigateRooms strater = find(1);
//                System.out.println(strater.roomDescription);
//
//                //This loop will start the game
//                while (!yesOrNo.isEmpty()) {
//
//                    room.exitGame(yesOrNo);
//
//                    if (yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("Yes")) {
//
//                        System.out.println("\n" + "Which direction do you want to go? (N,S,E,W) ");
//                        System.out.print("> ");
//                        String IDRoom = input.nextLine();
//                        room.exitGame(IDRoom);
//
//                        if (IDRoom != null) {
//
//                            //---4-----------------------------------------------------------------------------------------------------------
//
//                            //allows player to type N,E,S,W and check valid response
//                            if (navigateRooms.N.equalsIgnoreCase(player.userDirectionInput(IDRoom)) || navigateRooms.S.equalsIgnoreCase(player.userDirectionInput(IDRoom)) ||
//                                navigateRooms.W.equalsIgnoreCase(player.userDirectionInput(IDRoom)) || navigateRooms.E.equalsIgnoreCase(player.userDirectionInput(IDRoom))) {
//
//
//                                System.out.println("Huray!!");
//
//
////                                player.playerLocation(player.userDirectionInput(IDRoom));
//                                navigateRooms.compass(player.userDirectionInput(IDRoom), player.playerLocation(player.userDirectionInput(IDRoom)));
//
//
//
//                            } else {
//                                System.out.println("Not a Command!");
//                            }
//
//
//                            //---4-----------------------------------------------------------------------------------------------------------
//
//                        } else {
//                            System.out.println("Something wrong happened trying to find the directions!");
//
//                        }
//
//
//                    } else if (yesOrNo.equalsIgnoreCase("N") || yesOrNo.equalsIgnoreCase("No")) {
//                        System.out.println("Good Bye!");
//                        System.exit(0);
//
//                    } else {
//                        System.out.println("Invalid Response.");
//                        System.out.println("Would you like to play Adventure game demo Y/N: ");
//                        System.out.print("> ");
//                        yesOrNo = input.nextLine();
//                        room.exitGame(yesOrNo);
//                    }
//
//                }
//
//                //closing scanner
//                input.close();
//
//            }
//            catch (Exception e){
//                System.out.println("Something went wrong in the Game!");
//            }
//
//
//            //---3-----------------------------------------------------------------------------------------------------------
//
//
//        //closing scanner
//        scanner.close();
//
//    }
//
//
//
//    //Find roomNumber method
//    public static NavigateRooms find(int num) {
//
////        for (NavigateRooms  i : roomsArrayList) {
////            if (num == i.getRoomNumber()) {
////                return i;
////            }
////        }
//        return null;
//
//    }
//
//
//
//    }
