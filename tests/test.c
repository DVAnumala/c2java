int a, b = 1;

int f() {
    int i;
    for (i = 0; i < 10 && i <= 9 || i >= 0-1; ++i) {
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
    x[1][2][3].y = 123;
    a = b = 2;
    a += 2;
    write("%d\n", x[1][2][3].y);
    write("%d\n", 123 + 456 * 789);
    return 0xCAFEBABE;
}
