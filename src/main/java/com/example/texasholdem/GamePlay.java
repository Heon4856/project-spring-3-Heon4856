package com.example.texasholdem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GamePlay {
    List<Player> players= new ArrayList<>();
    CardDeck cardDeck = new CardDeck();
    Dealer dealer = new Dealer(cardDeck);
    Table table = new Table();

    public void play(){
        System.out.println("*****Poker******");
        Scanner sc = new Scanner(System.in);
        System.out.println("*****참가하실 플레이어 수를 입력해주세요******");
        int numOfPlayer = sc.nextInt();
        for(int i = 1;i<=numOfPlayer;i++){
            System.out.println( i+"번쨰 선수의 이름을 입력해주세요");

            String playerName = sc.next();
            System.out.println( i+"번쨰 선수의 칩을 입력해주세요");

            Long playerChips = sc.nextLong();
            Player player = new Player(playerName,playerChips);
            players.add(player);
        }

        receiveCardAllPlayers( dealer,players);
        receiveCardAllPlayers( dealer,players);
        System.out.println(players.get(0).toString());
        System.out.println(players.get(1).toString());
        betPhase(sc,players);

        putCardsOnTable(table,dealer);
        System.out.println(table.showCards().toString());
        betPhase(sc,players);

        putOneCardOnTable(table,dealer);
        System.out.println(table.showCards().toString());
        betPhase(sc,players);


        putOneCardOnTable(table,dealer);
        System.out.println(table.showCards().toString());
        betPhase(sc,players);


    }

    private void receiveCardAllPlayers( Dealer dealer, List<Player> players) {
        for(Player player : players) {
            System.out.println(player.getName()+"님에게 카드를 줍니다.");
            dealer.putCardToPlayer(player, cardDeck);
        }

    }

    private void putCardsOnTable(Table table, Dealer dealer) {
            System.out.println("카드를 한장 태웁니다.");
            dealer.burnCard(cardDeck);
            System.out.println("카드를 테이블에 3장 놓습니다.");
            dealer.putCardToTable(table, cardDeck);
            dealer.putCardToTable(table, cardDeck);
            dealer.putCardToTable(table, cardDeck);
    }

        private void putOneCardOnTable(Table table, Dealer dealer) {
            System.out.println("카드를 한장 태웁니다.");
            dealer.burnCard(cardDeck);
            System.out.println("카드를 테이블에 1장 놓습니다.");
            dealer.putCardToTable(table, cardDeck);
        }


        private void betPhase(Scanner sc, List<Player> players){
            for(Player player : players) {
                if(!player.isLive()){
                    System.out.println(player.getName()+"는 죽었으므로 넘어갑니다.");

                    continue;
                }
                System.out.println(player.getName()+"베팅하세요. 죽으시려면 -1을 입력해주세요");
                Long bettingCash = sc.nextLong();
                if(bettingCash == -1L){
                    player.Die();
                }else{
                    player.Bet(bettingCash);
                }
            }
        }


    public static void main(String[] args) {
        GamePlay game = new GamePlay();
        game.play();
    }



}
