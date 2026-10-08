package p012a2;

import b1.b;
import b1.d;
import b1.g;
import b1.i;
import b1.n;
import c5.h;
import p071kotlin.Metadata;
import u0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"La2/w1;", "", "<init>", "()V", "Lb1/i;", "interaction", "Lu0/l;", "Lc5/h;", "a", "(Lb1/i;)Lu0/l;", "b", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w1 f1977a = new w1();

    private w1() {
    }

    public final l<h> a(i interaction) {
        if ((interaction instanceof n.b) || (interaction instanceof b) || (interaction instanceof g) || (interaction instanceof d)) {
            return x1.f2000a;
        }
        return null;
    }

    public final l<h> b(i interaction) {
        if (!(interaction instanceof n.b) && !(interaction instanceof b)) {
            if (interaction instanceof g) {
                return x1.f2002c;
            }
            if (interaction instanceof d) {
                return x1.f2001b;
            }
            return null;
        }
        return x1.f2001b;
    }
}
