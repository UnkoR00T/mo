package kn;

/* JADX INFO: loaded from: classes4.dex */
final class n extends c {
    n() {
    }

    @Override // kn.c
    int c(char c15, StringBuilder sb5) {
        if (c15 == ' ') {
            sb5.append((char) 3);
            return 1;
        }
        if (c15 >= '0' && c15 <= '9') {
            sb5.append((char) (c15 - ','));
            return 1;
        }
        if (c15 >= 'a' && c15 <= 'z') {
            sb5.append((char) (c15 - 'S'));
            return 1;
        }
        if (c15 < ' ') {
            sb5.append((char) 0);
            sb5.append(c15);
            return 2;
        }
        if (c15 <= '/') {
            sb5.append((char) 1);
            sb5.append((char) (c15 - '!'));
            return 2;
        }
        if (c15 <= '@') {
            sb5.append((char) 1);
            sb5.append((char) (c15 - '+'));
            return 2;
        }
        if (c15 >= '[' && c15 <= '_') {
            sb5.append((char) 1);
            sb5.append((char) (c15 - 'E'));
            return 2;
        }
        if (c15 == '`') {
            sb5.append((char) 2);
            sb5.append((char) 0);
            return 2;
        }
        if (c15 <= 'Z') {
            sb5.append((char) 2);
            sb5.append((char) (c15 - '@'));
            return 2;
        }
        if (c15 > 127) {
            sb5.append("\u0001\u001e");
            return c((char) (c15 - 128), sb5) + 2;
        }
        sb5.append((char) 2);
        sb5.append((char) (c15 - '`'));
        return 2;
    }

    @Override // kn.c
    public int f() {
        return 2;
    }
}
