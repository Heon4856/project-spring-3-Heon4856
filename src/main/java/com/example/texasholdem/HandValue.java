package com.example.texasholdem;


public enum HandValue {

    /**
     * 로얄 플러시 (Ace-high 스트레이트 플러시).
     */
    ROYAL_FLUSH("a Royal Flush", 9),

    /**
     * 스트레이트 플러시 (스트레이트이자 플러시).
     */
    STRAIGHT_FLUSH("a Straight Flush", 8),

    /**
     * Four of a Kind (같은 숫자 네 장).
     */
    FOUR_OF_A_KIND("Four of a Kind", 7),

    /**
     * 풀하우스 (트리플과 원페어).
     */
    FULL_HOUSE("a Full House", 6),

    /**
     * 플러시 (같은 문양 5장).
     */
    FLUSH("a Flush", 5),

    /**
     * 스트레이트 (연속된 숫자 5장).
     */
    STRAIGHT("a Straight", 4),

    /**
     * 트리플 (같은 숫자 3장).
     */
    THREE_OF_A_KIND("Three of a Kind", 3),

    /**
     * 투 페어 (페어 2개).
     */
    TWO_PAIRS("Two Pairs", 2),

    /**
     * 원 페어 (같은 숫자 2장).
     */
    ONE_PAIR("One Pair", 1),

    /**
     * 족보에 해당하는 패가 아무 것도 없을 때.
     */
    HIGH_CARD("a High Card", 0),

    ;

    private String description;

    private int value;

    HandValue(String description, int value) {
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public int getValue() {
        return value;
    }
}
