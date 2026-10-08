package wi1;

import fr.t;
import iy.b0;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000f\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lwi1/d;", "Lgz/b;", "Lxw/g;", "Lwi1/d$b;", "Lg14/a;", "getInfoFromPeselUC", "<init>", "(Lg14/a;)V", "params", "d", "(Liy/b0;Ltq/e;)Ljava/lang/Object;", "a", "Lg14/a;", "getGetInfoFromPeselUC", "()Lg14/a;", "b", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements gz.b<xw.g, b> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f213639c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g14.a getInfoFromPeselUC;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lwi1/d$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b {
        Valid,
        Invalid,
        IncorrectPesel;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f213645e = wq.b.a(b());
    }

    public d(g14.a aVar) {
        this.getInfoFromPeselUC = aVar;
    }

    public Object d(b0 b0Var, tq.e<? super b> eVar) {
        g14.a.b bVarA = this.getInfoFromPeselUC.a(new g14.a.Params(b0Var, null));
        if (t.c(bVarA, g14.a.b.C1568a.f69766a) || t.c(bVarA, g14.a.b.C1569b.f69767a)) {
            return b.IncorrectPesel;
        }
        if (!(bVarA instanceof g14.a.b.Success)) {
            throw new p();
        }
        int age = ((g14.a.b.Success) bVarA).getAge();
        return (13 > age || age >= 18) ? b.Invalid : b.Valid;
    }
}
