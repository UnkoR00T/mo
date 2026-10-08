package iy;

import java.util.Arrays;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0019\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0011\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00002\n\u0010\u0015\u001a\u00020\u0002\"\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u0011J\r\u0010\u001d\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u000f¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Liy/b0;", "", "", "data", "<init>", "([C)V", "l", "()[C", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "c", "(Liy/b0;)Z", "", "chars", "b", "([C)Liy/b0;", "n", "d", "(I)Liy/b0;", "f", "q", "h", "()C", "m", "index", "i", "(I)C", "a", "[C", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b0 implements gz.b.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f97726c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b0 f97727d = new b0(new char[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final char[] data;

    /* JADX INFO: renamed from: iy.b0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Liy/b0$a;", "", "<init>", "()V", "Liy/b0;", "EMPTY", "Liy/b0;", "a", "()Liy/b0;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final b0 a() {
            return b0.f97727d;
        }

        private Companion() {
        }
    }

    public b0(char[] cArr) {
        this.data = cArr;
    }

    public final b0 b(char... chars) {
        return c0.g(c0.e(this) + new String(chars));
    }

    public final boolean c(b0 other) {
        return Arrays.equals(this.data, other.getData());
    }

    public final b0 d(int n15) {
        return c0.g(fu.r.A1(c0.e(this), n15));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (fr.t.c(b0.class, other != null ? other.getClass() : null)) {
            return c((b0) other);
        }
        return false;
    }

    public final b0 f(int n15) {
        return c0.g(fu.r.B1(c0.e(this), n15));
    }

    public final char h() {
        return fu.r.C1(c0.e(this));
    }

    public int hashCode() {
        return Arrays.hashCode(this.data);
    }

    public final char i(int index) {
        return c0.e(this).charAt(index);
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public char[] getData() {
        return this.data;
    }

    public final char m() {
        return fu.r.F1(c0.e(this));
    }

    public final int q() {
        return c0.e(this).length();
    }

    public String toString() {
        return "Sensitive string, redacted";
    }
}
