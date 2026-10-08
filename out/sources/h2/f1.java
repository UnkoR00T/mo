package h2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lh2/f1;", "", "<init>", "()V", "Lb1/i;", "interaction", "Lu0/l;", "Lc5/h;", "a", "(Lb1/i;)Lu0/l;", "b", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1 f79760a = new f1();

    private f1() {
    }

    public final u0.l<c5.h> a(b1.i interaction) {
        if ((interaction instanceof b1.n.b) || (interaction instanceof b1.b) || (interaction instanceof b1.g) || (interaction instanceof b1.d)) {
            return g1.f79769b;
        }
        return null;
    }

    public final u0.l<c5.h> b(b1.i interaction) {
        if (!(interaction instanceof b1.n.b) && !(interaction instanceof b1.b)) {
            if (interaction instanceof b1.g) {
                return g1.f79771d;
            }
            if (interaction instanceof b1.d) {
                return g1.f79770c;
            }
            return null;
        }
        return g1.f79770c;
    }
}
