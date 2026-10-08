package o8;

import ak.h2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f143068c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f143069a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f143070b = -1;

    public static /* synthetic */ boolean b(c9.k kVar) {
        return kVar.f24603b.equals("com.apple.iTunes") && kVar.f24604c.equals("iTunSMPB");
    }

    private boolean d(String str) {
        Matcher matcher = f143068c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i15 = Integer.parseInt((String) w7.o0.h(matcher.group(1)), 16);
            int i16 = Integer.parseInt((String) w7.o0.h(matcher.group(2)), 16);
            if (i15 <= 0 && i16 <= 0) {
                return false;
            }
            this.f143069a = i15;
            this.f143070b = i16;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean c() {
        return (this.f143069a == -1 || this.f143070b == -1) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean e(t7.v vVar) {
        h2 it = vVar.i(c9.e.class, new zj.q() { // from class: o8.c0
            @Override // zj.q
            public final boolean apply(Object obj) {
                return ((c9.e) obj).f24590c.equals("iTunSMPB");
            }
        }).iterator();
        while (it.hasNext()) {
            if (d(((c9.e) it.next()).f24591d)) {
                return true;
            }
        }
        h2 it4 = vVar.i(c9.k.class, new zj.q() { // from class: o8.d0
            @Override // zj.q
            public final boolean apply(Object obj) {
                return e0.b((c9.k) obj);
            }
        }).iterator();
        while (it4.hasNext()) {
            if (d(((c9.k) it4.next()).f24605d)) {
                return true;
            }
        }
        return false;
    }
}
