package st1;

import al0.BankRestrictionPassport;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageData;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lst1/e;", "Lxw/f;", "Lst1/e$a;", "Lst1/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lal0/o;", "Lmx/a;", "e", "(Lal0/o;)Lmx/a;", "params", "f", "(Lst1/e$a;)Lst1/c$a;", "a", "Lmx/c;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements xw.f<Params, c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: st1.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Lst1/e$a;", "", "Lst1/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lkotlin/Function1;", "Lal0/o;", "onPassportClick", "<init>", "(Lst1/b;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lst1/b;", "c", "()Lst1/b;", "b", "Ler/a;", "()Ler/a;", "Ler/l;", "()Ler/l;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final st1.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<BankRestrictionPassport, i0> onPassportClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(st1.b bVar, er.a<i0> aVar, er.l<? super BankRestrictionPassport, i0> lVar) {
            this.state = bVar;
            this.onBackClick = aVar;
            this.onPassportClick = lVar;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final er.l<BankRestrictionPassport, i0> b() {
            return this.onPassportClick;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final st1.b getState() {
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
            return fr.t.c(this.state, params.state) && fr.t.c(this.onBackClick, params.onBackClick) && fr.t.c(this.onPassportClick, params.onPassportClick);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onPassportClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onPassportClick=" + this.onPassportClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f184216a;

        static {
            int[] iArr = new int[al0.q.values().length];
            try {
                iArr[al0.q.BIOMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[al0.q.TEMPORARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[al0.q.BUSINESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[al0.q.DIPLOMATIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[al0.q.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f184216a = iArr;
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label e(BankRestrictionPassport bankRestrictionPassport) {
        al0.q type = bankRestrictionPassport.getType();
        int i15 = type == null ? -1 : b.f184216a[type.ordinal()];
        if (i15 != -1) {
            if (i15 == 1) {
                return this.labelProvider.c(et1.a.f53405f0);
            }
            if (i15 == 2) {
                return this.labelProvider.c(et1.a.f53439w0);
            }
            if (i15 == 3) {
                return this.labelProvider.c(et1.a.f53407g0);
            }
            if (i15 == 4) {
                return this.labelProvider.c(et1.a.f53419m0);
            }
            if (i15 != 5) {
                throw new oq.p();
            }
        }
        return this.labelProvider.c(et1.a.f53408h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, BankRestrictionPassport bankRestrictionPassport) {
        params.b().b(bankRestrictionPassport);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public c.a b(final Params params) {
        Label labelC;
        st1.b state = params.getState();
        if (fr.t.c(state, st1.b.a.f184200a)) {
            return c.a.C4753a.f184203a;
        }
        if (fr.t.c(state, st1.b.C4752b.f184201a)) {
            return new c.a.NoPassports(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(et1.a.f53429r0), null, null, null, 28, null), null, null, null, null, 61, null), new IconPageData(new q40.j.a(jz.a.f106835o2), this.labelProvider.c(et1.a.f53421n0), null, null, null, null, false, 76, null));
        }
        if (!(state instanceof st1.b.PassportsList)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(et1.a.f53429r0), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC2 = this.labelProvider.c(et1.a.f53437v0);
        List<BankRestrictionPassport> listA = ((st1.b.PassportsList) params.getState()).a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        for (final BankRestrictionPassport bankRestrictionPassport : listA) {
            SingleCardLabel singleCardLabel = new SingleCardLabel(e(bankRestrictionPassport), null, null, 0, 0, null, 62, null);
            String number = bankRestrictionPassport.getNumber();
            if (number == null || (labelC = mx.b.b(number, "passportNumberTag")) == null) {
                labelC = Label.INSTANCE.c();
            }
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: st1.d
                @Override // er.a
                public final Object a() {
                    return e.h(params, bankRestrictionPassport);
                }
            }, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(labelC, null, null, 0, 0, null, 62, null)), null, 4, null), null, new x0.Icon(jz.a.V, null, null, 6, null), null, 2813, null));
        }
        return new c.a.PassportsList(baseScaffoldData, labelC2, arrayList);
    }
}
