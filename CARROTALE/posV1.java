public class main {
    long posx = 0;
    long posy = 0;
    long posz = 0;
    int xMomentem = 0;
    int ymomentem = 0;
    int zmomentem =  0;
    int facing y = 0;
    int facingx = 0;
    int forwardMomentem = 0;
    int sidewaysMomentem = 0;
    int forwardspeed = 2;
    short speed = 1;
    short jumpKey = 32;
    short forwardKey = 87;
    short backKey = 83;
    short leftKey = 65;
    short rightKey = 68;
    short pauseKey = 27;
    float slipperyness = 0.8;
    double bouncienes = 0;
    boolean falling = true
}
public void update {
    //moving when key pressed
    if (/*key forwardKey pressed*/) {
        int forwardMomentem = forwardMomentem + forwardspeed;
    }
    if (/*key leftKey pressed*/) {
        short sidewaysMomentem = sidewaysMomentem - speed;
    }
    if (/*key rightKey pressed*/) {
        short sidewaysMomentem = sidewaysMomentem + speed;
    }
    if (/*key backKey pressed*/) {
        int forwardMomentem = forwardMomentem - speed;
    }
    int forwardMomentem = forwardMomentem * slipperyness;
    int sidewaysMomentem = sidewaysMomentem * slipperyness;
    int xMomentem = xMomentem * slipperyness;
    int zmomentem = zmomentem * slipperyness;
}