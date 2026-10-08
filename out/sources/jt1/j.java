package jt1;

import al0.BankRestrictionPassport;
import al0.PhysicalIdCard;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import p071kotlin.Metadata;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0013\u0010\r\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u0013\u0010\u000f\u001a\u00020\t*\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u000bJ\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0015*\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Ljt1/j;", "Lxw/f;", "Ljt1/j$a;", "Ljt1/i$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Ljt1/b;", "Lmx/a;", "i", "(Ljt1/b;)Lmx/a;", "c", "f", "Lal0/o;", "l", "(Lal0/o;)Lmx/a;", "r", "Ln50/b$b;", "e", "(Ljt1/b;)Ln50/b$b;", "", "h", "(Ljt1/b;)Ljava/util/List;", "params", "s", "(Ljt1/j$a;)Ljt1/i$a;", "Lkt1/c;", "restrictedDocumentType", "q", "(Lkt1/c;)Lmx/a;", "m", "a", "Lmx/c;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements xw.f<Params, i.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: jt1.j$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Ljt1/j$a;", "", "Ljt1/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onRestrict", "onBack", "<init>", "(Ljt1/b;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljt1/b;", "c", "()Ljt1/b;", "b", "Ler/a;", "()Ler/a;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final jt1.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onRestrict;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onBack;

        public Params(jt1.b bVar, er.a<oq.i0> aVar, er.a<oq.i0> aVar2) {
            this.state = bVar;
            this.onRestrict = aVar;
            this.onBack = aVar2;
        }

        public final er.a<oq.i0> a() {
            return this.onBack;
        }

        public final er.a<oq.i0> b() {
            return this.onRestrict;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final jt1.b getState() {
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
            return fr.t.c(this.state, params.state) && fr.t.c(this.onRestrict, params.onRestrict) && fr.t.c(this.onBack, params.onBack);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onRestrict.hashCode()) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onRestrict=" + this.onRestrict + ", onBack=" + this.onBack + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f105365b;

        static {
            int[] iArr = new int[kt1.c.values().length];
            try {
                iArr[kt1.c.ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kt1.c.PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kt1.c.DRIVING_LICENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f105364a = iArr;
            int[] iArr2 = new int[al0.q.values().length];
            try {
                iArr2[al0.q.BIOMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[al0.q.TEMPORARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[al0.q.BUSINESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[al0.q.DIPLOMATIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[al0.q.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            f105365b = iArr2;
        }
    }

    public j(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final Label c(jt1.b bVar) {
        if (bVar instanceof jt1.b.InterfaceC2499b) {
            return this.labelProvider.c(et1.a.R);
        }
        if (bVar instanceof jt1.b.c) {
            return this.labelProvider.c(et1.a.f53409h0);
        }
        if (bVar instanceof jt1.b.a) {
            return this.labelProvider.c(et1.a.f53424p);
        }
        throw new oq.p();
    }

    private final n50.b.Title e(jt1.b bVar) {
        Label labelB;
        if (bVar instanceof jt1.b.InterfaceC2499b) {
            StringBuilder sb5 = new StringBuilder();
            jt1.b.InterfaceC2499b interfaceC2499b = (jt1.b.InterfaceC2499b) bVar;
            PhysicalIdCard document = interfaceC2499b.getPhysicalIdCardRestrictions().getDocument();
            sb5.append(document != null ? document.getSeries() : null);
            PhysicalIdCard document2 = interfaceC2499b.getPhysicalIdCardRestrictions().getDocument();
            sb5.append(document2 != null ? document2.getNumber() : null);
            labelB = mx.b.b(sb5.toString(), "SeriesAndNumber");
        } else if (bVar instanceof jt1.b.c) {
            String number = ((jt1.b.c) bVar).getPassport().getNumber();
            labelB = number != null ? mx.b.b(number, "SeriesAndNumber") : null;
        } else {
            if (!(bVar instanceof jt1.b.a)) {
                throw new oq.p();
            }
            labelB = mx.b.b(((jt1.b.a) bVar).getDrivingLicenceRestrictionData().getDocumentNumber(), "CardNumber");
        }
        if (labelB == null) {
            labelB = Label.INSTANCE.c();
        }
        return new n50.b.Title(n50.l.b(labelB, null, null, 3, null));
    }

    private final Label f(jt1.b bVar) {
        if (bVar instanceof jt1.b.InterfaceC2499b) {
            return this.labelProvider.c(et1.a.f53404f);
        }
        if (bVar instanceof jt1.b.c) {
            return l(((jt1.b.c) bVar).getPassport());
        }
        if (bVar instanceof jt1.b.a) {
            return this.labelProvider.c(et1.a.f53394a);
        }
        throw new oq.p();
    }

    private final List<Label> h(jt1.b bVar) {
        if (bVar instanceof jt1.b.InterfaceC2499b) {
            return pq.v.q(this.labelProvider.c(et1.a.N), this.labelProvider.c(et1.a.O), this.labelProvider.c(et1.a.P));
        }
        if (bVar instanceof jt1.b.c) {
            return pq.v.q(this.labelProvider.c(et1.a.f53411i0), this.labelProvider.c(et1.a.f53413j0), this.labelProvider.c(et1.a.f53415k0));
        }
        if (bVar instanceof jt1.b.a) {
            return pq.v.q(this.labelProvider.c(et1.a.f53440x), this.labelProvider.c(et1.a.f53442y));
        }
        throw new oq.p();
    }

    private final Label i(jt1.b bVar) {
        if (bVar instanceof jt1.b.InterfaceC2499b) {
            return this.labelProvider.c(et1.a.S);
        }
        if (bVar instanceof jt1.b.c) {
            return this.labelProvider.c(et1.a.f53417l0);
        }
        if (bVar instanceof jt1.b.a) {
            return this.labelProvider.c(et1.a.f53426q);
        }
        throw new oq.p();
    }

    private final Label l(BankRestrictionPassport bankRestrictionPassport) {
        al0.q type = bankRestrictionPassport.getType();
        int i15 = type == null ? -1 : b.f105365b[type.ordinal()];
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

    private final Label r(jt1.b bVar) {
        if (bVar instanceof jt1.b.InterfaceC2499b) {
            return this.labelProvider.c(et1.a.M);
        }
        if (bVar instanceof jt1.b.c) {
            return this.labelProvider.c(et1.a.f53429r0);
        }
        if (bVar instanceof jt1.b.a) {
            return this.labelProvider.c(et1.a.f53438w);
        }
        throw new oq.p();
    }

    public final Label m(kt1.c restrictedDocumentType) {
        int i15 = b.f105364a[restrictedDocumentType.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(et1.a.T);
        }
        if (i15 == 2) {
            return this.labelProvider.c(et1.a.f53433t0);
        }
        if (i15 == 3) {
            return this.labelProvider.c(et1.a.f53444z);
        }
        throw new oq.p();
    }

    public final Label q(kt1.c restrictedDocumentType) {
        int i15 = b.f105364a[restrictedDocumentType.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(et1.a.U);
        }
        if (i15 == 2) {
            return this.labelProvider.c(et1.a.f53435u0);
        }
        if (i15 == 3) {
            return this.labelProvider.c(et1.a.A);
        }
        throw new oq.p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public i.a b(Params params) {
        jt1.b state = params.getState();
        if (!(state instanceof jt1.b.InterfaceC2499b.Initialized) && !(state instanceof Restricting) && !(state instanceof jt1.b.c.Initialized) && !(state instanceof Restricting) && !(state instanceof jt1.b.a.Initialized) && !(state instanceof Restricting)) {
            if (state instanceof Error) {
                return new i.a.Error(((Error) state).getErrorVMS());
            }
            if (state instanceof Error) {
                return new i.a.Error(((Error) state).getErrorVMS());
            }
            if (state instanceof Error) {
                return new i.a.Error(((Error) state).getErrorVMS());
            }
            throw new oq.p();
        }
        return new i.a.Initialized(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), r(params.getState()), null, null, null, 28, null), null, null, null, null, 61, null), i(params.getState()), c(params.getState()), new CardListData(pq.v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(f(params.getState()), null, null, 3, null), e(params.getState()), null, 4, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.L0, null, null, null, null, 30, null), 3, null), null, null, 3327, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(n50.l.b(this.labelProvider.c(et1.a.B0), null, null, 3, null), new n50.b.Title(n50.l.b(this.labelProvider.c(et1.a.C0), null, null, 3, null)), null, 4, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106874u, null, null, null, null, 30, null), 3, null), null, null, 3327, null)), null, false, null, null, 30, null), this.labelProvider.c(et1.a.Q), h(params.getState()), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(et1.a.f53398c), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null), params.a());
    }
}
