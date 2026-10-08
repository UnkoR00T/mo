package pg3;

import c20.d;
import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import fe3.y4;
import fr.t;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0019\u0017B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\n2\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lpg3/b;", "Lxw/f;", "Lpg3/b$b;", "Lcb4/d;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lfe3/y4;", "currentDestination", "Lpg3/b$a;", "f", "(Lfe3/y4;)Lpg3/b$a;", "", "h", "(Lpg3/b$a;)I", "workingCopyValidityDays", "Lmx/a;", "e", "(Lpg3/b$a;I)Lmx/a;", "params", "i", "(Lpg3/b$b;)Lcb4/d;", "a", "Lmx/c;", "b", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, DialogData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lpg3/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private enum a {
        GENERIC,
        SAVE_DRAFT;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ wq.a f157530d = wq.b.a(b());
    }

    /* JADX INFO: renamed from: pg3.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, d2 = {"Lpg3/b$b;", "", "Lfe3/y4;", "currentDestination", "", "workingCopyValidityDays", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "<init>", "(Lfe3/y4;Ljava/lang/Integer;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfe3/y4;", "()Lfe3/y4;", "b", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "Ler/a;", "()Ler/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final y4 currentDestination;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer workingCopyValidityDays;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        public Params(y4 y4Var, Integer num, er.a<i0> aVar) {
            this.currentDestination = y4Var;
            this.workingCopyValidityDays = num;
            this.onCloseAction = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final y4 getCurrentDestination() {
            return this.currentDestination;
        }

        public final er.a<i0> b() {
            return this.onCloseAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getWorkingCopyValidityDays() {
            return this.workingCopyValidityDays;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.currentDestination, params.currentDestination) && t.c(this.workingCopyValidityDays, params.workingCopyValidityDays) && t.c(this.onCloseAction, params.onCloseAction);
        }

        public int hashCode() {
            int iHashCode = this.currentDestination.hashCode() * 31;
            Integer num = this.workingCopyValidityDays;
            return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.onCloseAction.hashCode();
        }

        public String toString() {
            return "Params(currentDestination=" + this.currentDestination + ", workingCopyValidityDays=" + this.workingCopyValidityDays + ", onCloseAction=" + this.onCloseAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f157534a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.GENERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.SAVE_DRAFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f157534a = iArr;
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label e(a aVar, int i15) {
        if (c.f157534a[aVar.ordinal()] != 2) {
            return null;
        }
        mx.c cVar = this.labelProvider;
        return cVar.f(md3.b.f125815r3, cVar.a(d.f22740a, i15, String.valueOf(i15)));
    }

    private final a f(y4 currentDestination) {
        if (t.c(currentDestination, y4.h.f62060a) || t.c(currentDestination, y4.a.f62046a) || t.c(currentDestination, y4.o.f62074a) || t.c(currentDestination, y4.q.f62078a) || t.c(currentDestination, y4.r.f62080a) || t.c(currentDestination, y4.f.f62056a)) {
            return a.GENERIC;
        }
        if (t.c(currentDestination, y4.u.f62086a) || t.c(currentDestination, y4.v.f62088a) || t.c(currentDestination, y4.j.f62064a) || t.c(currentDestination, y4.s.f62082a) || t.c(currentDestination, y4.t.f62084a) || t.c(currentDestination, y4.w.f62090a) || t.c(currentDestination, y4.e.f62054a) || t.c(currentDestination, y4.n.f62072a) || t.c(currentDestination, y4.k.f62066a) || t.c(currentDestination, y4.m.f62070a) || t.c(currentDestination, y4.p.f62076a) || t.c(currentDestination, y4.i.f62062a) || t.c(currentDestination, y4.b.f62048a) || t.c(currentDestination, y4.g.f62058a) || t.c(currentDestination, y4.d.f62052a) || t.c(currentDestination, y4.l.f62068a)) {
            return a.SAVE_DRAFT;
        }
        throw new p();
    }

    private final int h(a aVar) {
        int i15 = c.f157534a[aVar.ordinal()];
        if (i15 == 1) {
            return md3.b.f125839u3;
        }
        if (i15 == 2) {
            return md3.b.f125823s3;
        }
        throw new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l() {
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public DialogData b(Params params) {
        a aVarF = f(params.getCurrentDestination());
        h.b bVar = h.b.f24985a;
        Label labelC = this.labelProvider.c(h(aVarF));
        Integer workingCopyValidityDays = params.getWorkingCopyValidityDays();
        return new DialogData(bVar, labelC, workingCopyValidityDays != null ? e(aVarF, workingCopyValidityDays.intValue()) : null, new DialogButtonTextData(this.labelProvider.c(md3.b.f125707e), null, params.b(), 2, null), new DialogButtonTextData(this.labelProvider.c(md3.b.T), null, new er.a() { // from class: pg3.a
            @Override // er.a
            public final Object a() {
                return b.l();
            }
        }, 2, null), null, null, 96, null);
    }
}
