package lm;

import jg.s;

/* JADX INFO: loaded from: classes4.dex */
public class a extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f118841a;

    public a(String str, int i15) {
        super(s.g(str, "Provided message must not be empty."));
        this.f118841a = i15;
    }

    public int a() {
        return this.f118841a;
    }

    public a(String str, int i15, Throwable th4) {
        super(s.g(str, "Provided message must not be empty."), th4);
        this.f118841a = i15;
    }
}
