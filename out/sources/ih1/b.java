package ih1;

import fr.t;
import h30.ButtonData;
import hh1.State;
import hh1.g;
import i50.BaseScaffoldData;
import k30.d;
import k34.u;
import mx.Label;
import mx.c;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lih1/b;", "Lxw/f;", "Lih1/b$a;", "Lhh1/g$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lk34/u;", "Lmx/a;", "f", "(Lk34/u;)Lmx/a;", "e", "params", "h", "(Lih1/b$a;)Lhh1/g$a;", "a", "Lmx/c;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, g.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: ih1.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lih1/b$a;", "", "Lhh1/f;", "state", "Lkotlin/Function0;", "Loq/i0;", "onRenewDocumentClick", "<init>", "(Lhh1/f;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhh1/f;", "b", "()Lhh1/f;", "Ler/a;", "()Ler/a;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRenewDocumentClick;

        public Params(State state, er.a<i0> aVar) {
            this.state = state;
            this.onRenewDocumentClick = aVar;
        }

        public final er.a<i0> a() {
            return this.onRenewDocumentClick;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onRenewDocumentClick, params.onRenewDocumentClick);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onRenewDocumentClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onRenewDocumentClick=" + this.onRenewDocumentClick + ')';
        }
    }

    /* JADX INFO: renamed from: ih1.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C2185b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f92328a;

        static {
            int[] iArr = new int[u.values().length];
            try {
                iArr[u.MOBYWATEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.DIIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u.STUDENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f92328a = iArr;
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    private final Label e(u uVar) {
        int i15;
        int i16 = C2185b.f92328a[uVar.ordinal()];
        if (i16 == 1) {
            i15 = sg1.a.X;
        } else if (i16 == 2) {
            i15 = sg1.a.V;
        } else {
            if (i16 != 3) {
                throw new p();
            }
            i15 = sg1.a.Z;
        }
        return this.labelProvider.c(i15);
    }

    private final Label f(u uVar) {
        int i15;
        int i16 = C2185b.f92328a[uVar.ordinal()];
        if (i16 == 1) {
            i15 = sg1.a.Y;
        } else if (i16 == 2) {
            i15 = sg1.a.W;
        } else {
            if (i16 != 3) {
                throw new p();
            }
            i15 = sg1.a.f181448a0;
        }
        return this.labelProvider.c(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i() {
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public g.Data b(Params params) {
        Label labelC;
        Label labelC2;
        u identityType = params.getState().getIdentityType();
        if (identityType == null || (labelC = f(identityType)) == null) {
            labelC = Label.INSTANCE.c();
        }
        u identityType2 = params.getState().getIdentityType();
        if (identityType2 == null || (labelC2 = e(identityType2)) == null) {
            labelC2 = Label.INSTANCE.c();
        }
        return new g.Data(labelC, labelC2, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(sg1.a.F), null, 2, null), d.a.f107773a, null, params.a(), 35, null), new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.C5782b.f216863a, new er.a() { // from class: ih1.a
            @Override // er.a
            public final Object a() {
                return b.i();
            }
        }), this.labelProvider.c(sg1.a.H0), null, null, null, 28, null), null, null, null, null, 61, null));
    }
}
