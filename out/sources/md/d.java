package md;

import java.util.List;
import od.q;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<q> f125632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f125633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f125634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f125635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f125636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f125637f;

    public d(List<q> list, char c15, double d15, double d16, String str, String str2) {
        this.f125632a = list;
        this.f125633b = c15;
        this.f125634c = d15;
        this.f125635d = d16;
        this.f125636e = str;
        this.f125637f = str2;
    }

    public static int c(char c15, String str, String str2) {
        return (((c15 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<q> a() {
        return this.f125632a;
    }

    public double b() {
        return this.f125635d;
    }

    public int hashCode() {
        return c(this.f125633b, this.f125637f, this.f125636e);
    }
}
