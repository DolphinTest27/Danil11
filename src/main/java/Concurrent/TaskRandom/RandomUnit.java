package Concurrent.TaskRandom;

import java.util.Random;

public final class RandomUnit {
    public static final Random RANDOM=new Random();
    private static final int DEFAULT_BOUND = 10;

    private RandomUnit(){

    }
    public static int getRandom(){
        return RANDOM.nextInt(DEFAULT_BOUND);
    }
    public static int getRandom(int bound){
        return RANDOM.nextInt(bound );
    }
}
