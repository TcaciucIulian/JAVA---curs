import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("WinterSongs", "ACDC");
        album.addSong("Back in Black",3.5);
        album.addSong("Highway To Hell",2.7);
        album.addSong("Shoot to Thrill",4.2);
        album.addSong("Thunderstuck",5);
        albums.add(album);

        album = new Album("Kamikaze","Eminem");
        album.addSong("The Ringer", 5.38);
        album.addSong("Greatest", 3.48);
        album.addSong("Lucky You", 4);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Back in Black", playList);
        albums.get(0).addToPlayList("Highway To Hell", playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList("Lucky You", playList);
        albums.get(1).addToPlayList(25, playList); // Not exists.


        play(playList);
    }

    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No songs in playlist");
            return;
        }else{
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            System.out.println("Enter action :");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("PlayList complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing ->" + listIterator.next().toString());
                    } else{
                        System.out.println("End of the list");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing -> " + listIterator.previous().toString());
                    } else{
                        System.out.println("Start of the list");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = true;
                        }else{
                            System.out.println("Start of the list");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        }else{
                            System.out.println("End of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    System.out.println("Deleted the current song");
                    if(playList.size() > 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        }else if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous());
                        }else{
                            System.out.println("PlayList is empty");
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions: \n pick a number");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list of songs from playlist\n" +
                "5 - print available actions\n");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("##################");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("##################");
    }
}