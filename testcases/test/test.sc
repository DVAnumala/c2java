
int a, b = 1;

int f() {
    int i;
    for (i = 0; i < 10 && i <= 9 || i; ++i) {
        if (i < 05) {
            continue;
        } else break;
    }
    return i;
}

struct T {
    int y;
};

int main(int argc) {
    struct T x[10][20][30];
    int multi[40][30][20][10];
    multi[2][3][4][1] = 666;
    x[1][2][3].y = 123;
    a = b = 2;
    a += 2;
    write(multi[2][3][4][1]);
    if (a < 3 && b || (b - 2) || !b || b != 1 && b - 1 || x[1][2][3].y || f()) {
    	read(multi[1][2][3][4]);
    	write(multi[1][2][3][4]);
    }
    write(x[1][2][3].y);
    read(x[0][3][2].y);
    write(x[0][3][2].y);
    write(123 + 456 * 789);
    return 0xCAFEBABE;
}
