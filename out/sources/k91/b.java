package k91;

import er.l;
import fr.t;
import i50.BaseScaffoldData;
import j91.State;
import j91.d;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\r*\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lk91/b;", "Lxw/f;", "Lk91/b$a;", "Lj91/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Ll91/b;", "", "Li61/l;", "f", "(Ll91/b;)Ljava/util/List;", "", "h", "(Li61/l;)I", "e", "(Li61/l;)Ljava/lang/Integer;", "params", "i", "(Lk91/b$a;)Lj91/d$a;", "a", "Lmx/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: k91.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lk91/b$a;", "", "Lj91/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "backAction", "closeAction", "Lkotlin/Function1;", "Li61/l;", "onDiscountPicked", "<init>", "(Lj91/c;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj91/c;", "d", "()Lj91/c;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<i61.l, i0> onDiscountPicked;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, l<? super i61.l, i0> lVar) {
            this.state = state;
            this.backAction = aVar;
            this.closeAction = aVar2;
            this.onDiscountPicked = lVar;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.closeAction;
        }

        public final l<i61.l, i0> c() {
            return this.onDiscountPicked;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.backAction, params.backAction) && t.c(this.closeAction, params.closeAction) && t.c(this.onDiscountPicked, params.onDiscountPicked);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.backAction.hashCode()) * 31) + this.closeAction.hashCode()) * 31) + this.onDiscountPicked.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", backAction=" + this.backAction + ", closeAction=" + this.closeAction + ", onDiscountPicked=" + this.onDiscountPicked + ')';
        }
    }

    /* JADX INFO: renamed from: k91.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C2604b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f109225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f109226b;

        static {
            int[] iArr = new int[l91.b.values().length];
            try {
                iArr[l91.b.PASSPORT_POLAND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l91.b.PASSPORT_ABROAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l91.b.TEMPORARY_PASSPORT_POLAND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l91.b.TEMPORARY_PASSPORT_ABROAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f109225a = iArr;
            int[] iArr2 = new int[i61.l.values().length];
            try {
                iArr2[i61.l.SCHOOL_AGED_CHILDREN.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[i61.l.KDR_OWNERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[i61.l.TECHNICAL_ISSUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[i61.l.CHILD_TREATED_ABROAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[i61.l.TEMPORARY_PASSPORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            f109226b = iArr2;
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    private final Integer e(i61.l lVar) {
        int i15 = C2604b.f109226b[lVar.ordinal()];
        if (i15 == 1 || i15 == 2) {
            return null;
        }
        if (i15 == 3) {
            return Integer.valueOf(w51.a.f210354j0);
        }
        if (i15 == 4) {
            return Integer.valueOf(w51.a.f210382n0);
        }
        if (i15 == 5) {
            return null;
        }
        throw new p();
    }

    private final List<i61.l> f(l91.b bVar) {
        int i15 = C2604b.f109225a[bVar.ordinal()];
        if (i15 == 1) {
            return v.q(i61.l.SCHOOL_AGED_CHILDREN, i61.l.KDR_OWNERS, i61.l.TECHNICAL_ISSUE, i61.l.CHILD_TREATED_ABROAD);
        }
        if (i15 == 2) {
            return v.q(i61.l.SCHOOL_AGED_CHILDREN, i61.l.KDR_OWNERS, i61.l.TECHNICAL_ISSUE);
        }
        if (i15 == 3) {
            return v.q(i61.l.TEMPORARY_PASSPORT, i61.l.TECHNICAL_ISSUE);
        }
        if (i15 == 4) {
            return v.q(i61.l.TEMPORARY_PASSPORT, i61.l.TECHNICAL_ISSUE);
        }
        throw new p();
    }

    private final int h(i61.l lVar) {
        int i15 = C2604b.f109226b[lVar.ordinal()];
        if (i15 == 1) {
            return w51.a.f210340h0;
        }
        if (i15 == 2) {
            return w51.a.f210333g0;
        }
        if (i15 == 3) {
            return w51.a.f210347i0;
        }
        if (i15 == 4) {
            return w51.a.f210375m0;
        }
        if (i15 == 5) {
            return w51.a.f210361k0;
        }
        throw new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, i61.l lVar) {
        params.c().b(lVar);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public d.Data b(final Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(w51.a.f210368l0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(w51.a.f210326f0);
        List<i61.l> listF = f(params.getState().getPassportTypeWithPlace());
        ArrayList arrayList = new ArrayList(v.y(listF, 10));
        for (final i61.l lVar : listF) {
            n50.b.Title title = new n50.b.Title(new SingleCardLabel(this.labelProvider.c(h(lVar)), null, null, 0, 0, null, 62, null));
            Integer numE = e(lVar);
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: k91.a
                @Override // er.a
                public final Object a() {
                    return b.l(params, lVar);
                }
            }, false, null, null, false, null, null, new BodySection(null, title, numE != null ? new SingleCardLabel(this.labelProvider.c(numE.intValue()), null, null, 0, 0, null, 62, null) : null, 1, null), null, x0.Icon.INSTANCE.b(), null, 2813, null));
        }
        return new d.Data(baseScaffoldData, labelC, new CardListData(arrayList, null, false, null, null, 30, null), params.a());
    }
}
