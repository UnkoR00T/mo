package q41;

import bl0.s;
import fr.t;
import i50.BaseScaffoldData;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import o41.State;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0017\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J+\u0010\u0018\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0016J1\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lq41/q;", "Lxw/f;", "Lq41/q$a;", "Lo41/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lxw/e;", "parentGender", "Lbl0/d;", "maritalStatusType", "", "areMultipleChildren", "Lkotlin/Function1;", "Lbl0/s;", "Loq/i0;", "onClick", "Ln30/b;", "G", "(Lxw/e;Lbl0/d;ZLer/l;)Ln30/b;", "O", "(ZLer/l;)Ln30/b;", "V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "", "titleResId", "descResId", "Lkotlin/Function0;", "Ln50/g;", "a0", "(ILjava/lang/Integer;Ler/a;)Ln50/g;", "params", "c0", "(Lq41/q$a;)Lo41/c$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements xw.f<Params, o41.c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: q41.q$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001b\u0010 ¨\u0006!"}, d2 = {"Lq41/q$a;", "", "Lo41/b;", "state", "Lkotlin/Function1;", "Lbl0/s;", "Loq/i0;", "onAddressChildSelection", "Lkotlin/Function0;", "onClose", "onBack", "<init>", "(Lo41/b;Ler/l;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo41/b;", "d", "()Lo41/b;", "b", "Ler/l;", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<s, i0> onAddressChildSelection;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.l<? super s, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = state;
            this.onAddressChildSelection = lVar;
            this.onClose = aVar;
            this.onBack = aVar2;
        }

        public final er.l<s, i0> a() {
            return this.onAddressChildSelection;
        }

        public final er.a<i0> b() {
            return this.onBack;
        }

        public final er.a<i0> c() {
            return this.onClose;
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
            return t.c(this.state, params.state) && t.c(this.onAddressChildSelection, params.onAddressChildSelection) && t.c(this.onClose, params.onClose) && t.c(this.onBack, params.onBack);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onAddressChildSelection.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onAddressChildSelection=" + this.onAddressChildSelection + ", onClose=" + this.onClose + ", onBack=" + this.onBack + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f164713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f164714b;

        static {
            int[] iArr = new int[bl0.d.values().length];
            try {
                iArr[bl0.d.NoMarriageAndNoAcceptChild.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bl0.d.NoMarriageAndAcceptChild.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[bl0.d.InMarriage.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[bl0.d.MarriageEnded.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f164713a = iArr;
            int[] iArr2 = new int[xw.e.values().length];
            try {
                iArr2[xw.e.FEMALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[xw.e.MALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f164714b = iArr2;
        }
    }

    public q(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final CardListData G(xw.e parentGender, bl0.d maritalStatusType, boolean areMultipleChildren, er.l<? super s, i0> onClick) {
        int i15 = b.f164714b[parentGender.ordinal()];
        if (i15 != 1) {
            if (i15 == 2) {
                return H(areMultipleChildren, onClick);
            }
            throw new oq.p();
        }
        int i16 = b.f164713a[maritalStatusType.ordinal()];
        if (i16 == 1) {
            return V(areMultipleChildren, onClick);
        }
        if (i16 == 2 || i16 == 3 || i16 == 4) {
            return O(areMultipleChildren, onClick);
        }
        throw new oq.p();
    }

    private final CardListData H(boolean areMultipleChildren, final er.l<? super s, i0> onClick) {
        int i15;
        int i16;
        int i17;
        int i18;
        DefaultSingleCardData defaultSingleCardDataB0 = b0(this, j31.a.f99203r, null, new er.a() { // from class: q41.b
            @Override // er.a
            public final Object a() {
                return q.I(onClick);
            }
        }, 2, null);
        DefaultSingleCardData defaultSingleCardDataB1 = b0(this, j31.a.f99208s, null, new er.a() { // from class: q41.c
            @Override // er.a
            public final Object a() {
                return q.J(onClick);
            }
        }, 2, null);
        if (areMultipleChildren) {
            i15 = j31.a.f99218u;
        } else {
            if (areMultipleChildren) {
                throw new oq.p();
            }
            i15 = j31.a.f99213t;
        }
        DefaultSingleCardData defaultSingleCardDataB2 = b0(this, i15, null, new er.a() { // from class: q41.d
            @Override // er.a
            public final Object a() {
                return q.K(onClick);
            }
        }, 2, null);
        if (areMultipleChildren) {
            i16 = j31.a.f99228w;
        } else {
            if (areMultipleChildren) {
                throw new oq.p();
            }
            i16 = j31.a.f99223v;
        }
        DefaultSingleCardData defaultSingleCardDataB3 = b0(this, i16, null, new er.a() { // from class: q41.e
            @Override // er.a
            public final Object a() {
                return q.L(onClick);
            }
        }, 2, null);
        if (areMultipleChildren) {
            i17 = j31.a.f99236y;
        } else {
            if (areMultipleChildren) {
                throw new oq.p();
            }
            i17 = j31.a.f99232x;
        }
        DefaultSingleCardData defaultSingleCardDataB4 = b0(this, i17, null, new er.a() { // from class: q41.f
            @Override // er.a
            public final Object a() {
                return q.M(onClick);
            }
        }, 2, null);
        if (areMultipleChildren) {
            i18 = j31.a.A;
        } else {
            if (areMultipleChildren) {
                throw new oq.p();
            }
            i18 = j31.a.f99240z;
        }
        return new CardListData(v.q(defaultSingleCardDataB0, defaultSingleCardDataB1, defaultSingleCardDataB2, defaultSingleCardDataB3, defaultSingleCardDataB4, b0(this, i18, null, new er.a() { // from class: q41.g
            @Override // er.a
            public final Object a() {
                return q.N(onClick);
            }
        }, 2, null)), null, false, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(er.l lVar) {
        lVar.b(s.MyPermanentAddress);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(er.l lVar) {
        lVar.b(s.MyTemporaryAddress);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(er.l lVar) {
        lVar.b(s.PermanentMotherAddress);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(er.l lVar) {
        lVar.b(s.TemporaryMotherAddress);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(er.l lVar) {
        lVar.b(s.MeAndMotherAreNotRegistered);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(er.l lVar) {
        lVar.b(s.DoesNotRegisterChild);
        return i0.f148189a;
    }

    private final CardListData O(boolean areMultipleChildren, final er.l<? super s, i0> onClick) {
        int i15;
        int i16;
        int i17;
        int i18;
        DefaultSingleCardData defaultSingleCardDataB0 = b0(this, j31.a.B, null, new er.a() { // from class: q41.k
            @Override // er.a
            public final Object a() {
                return q.P(onClick);
            }
        }, 2, null);
        DefaultSingleCardData defaultSingleCardDataB1 = b0(this, j31.a.C, null, new er.a() { // from class: q41.l
            @Override // er.a
            public final Object a() {
                return q.Q(onClick);
            }
        }, 2, null);
        if (areMultipleChildren) {
            i15 = j31.a.E;
        } else {
            if (areMultipleChildren) {
                throw new oq.p();
            }
            i15 = j31.a.D;
        }
        DefaultSingleCardData defaultSingleCardDataB2 = b0(this, i15, null, new er.a() { // from class: q41.m
            @Override // er.a
            public final Object a() {
                return q.R(onClick);
            }
        }, 2, null);
        if (areMultipleChildren) {
            i16 = j31.a.G;
        } else {
            if (areMultipleChildren) {
                throw new oq.p();
            }
            i16 = j31.a.F;
        }
        DefaultSingleCardData defaultSingleCardDataB3 = b0(this, i16, null, new er.a() { // from class: q41.n
            @Override // er.a
            public final Object a() {
                return q.S(onClick);
            }
        }, 2, null);
        if (areMultipleChildren) {
            i17 = j31.a.I;
        } else {
            if (areMultipleChildren) {
                throw new oq.p();
            }
            i17 = j31.a.H;
        }
        DefaultSingleCardData defaultSingleCardDataB4 = b0(this, i17, null, new er.a() { // from class: q41.o
            @Override // er.a
            public final Object a() {
                return q.T(onClick);
            }
        }, 2, null);
        if (areMultipleChildren) {
            i18 = j31.a.K;
        } else {
            if (areMultipleChildren) {
                throw new oq.p();
            }
            i18 = j31.a.J;
        }
        return new CardListData(v.q(defaultSingleCardDataB0, defaultSingleCardDataB1, defaultSingleCardDataB2, defaultSingleCardDataB3, defaultSingleCardDataB4, b0(this, i18, null, new er.a() { // from class: q41.p
            @Override // er.a
            public final Object a() {
                return q.U(onClick);
            }
        }, 2, null)), null, false, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(er.l lVar) {
        lVar.b(s.MyPermanentAddress);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q(er.l lVar) {
        lVar.b(s.MyTemporaryAddress);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(er.l lVar) {
        lVar.b(s.PermanentFatherAddress);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S(er.l lVar) {
        lVar.b(s.TemporaryFatherAddress);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T(er.l lVar) {
        lVar.b(s.MeAndFatherAreNotRegistered);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U(er.l lVar) {
        lVar.b(s.DoesNotRegisterChild);
        return i0.f148189a;
    }

    private final CardListData V(boolean areMultipleChildren, final er.l<? super s, i0> onClick) {
        int i15;
        DefaultSingleCardData defaultSingleCardDataB0 = b0(this, j31.a.Q, null, new er.a() { // from class: q41.a
            @Override // er.a
            public final Object a() {
                return q.W(onClick);
            }
        }, 2, null);
        DefaultSingleCardData defaultSingleCardDataB1 = b0(this, j31.a.R, null, new er.a() { // from class: q41.h
            @Override // er.a
            public final Object a() {
                return q.X(onClick);
            }
        }, 2, null);
        DefaultSingleCardData defaultSingleCardDataB2 = b0(this, j31.a.S, null, new er.a() { // from class: q41.i
            @Override // er.a
            public final Object a() {
                return q.Y(onClick);
            }
        }, 2, null);
        if (areMultipleChildren) {
            i15 = j31.a.U;
        } else {
            if (areMultipleChildren) {
                throw new oq.p();
            }
            i15 = j31.a.T;
        }
        return new CardListData(v.q(defaultSingleCardDataB0, defaultSingleCardDataB1, defaultSingleCardDataB2, b0(this, i15, null, new er.a() { // from class: q41.j
            @Override // er.a
            public final Object a() {
                return q.Z(onClick);
            }
        }, 2, null)), null, false, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W(er.l lVar) {
        lVar.b(s.MyPermanentAddress);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X(er.l lVar) {
        lVar.b(s.MyTemporaryAddress);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y(er.l lVar) {
        lVar.b(s.IAmNotRegistered);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z(er.l lVar) {
        lVar.b(s.DoesNotRegisterChild);
        return i0.f148189a;
    }

    private final DefaultSingleCardData a0(int titleResId, Integer descResId, er.a<i0> onClick) {
        SingleCardLabel singleCardLabel;
        n50.b.Title title = new n50.b.Title(new SingleCardLabel(this.labelProvider.c(titleResId), null, null, 0, 0, null, 62, null));
        if (descResId != null) {
            singleCardLabel = new SingleCardLabel(this.labelProvider.c(descResId.intValue()), null, null, 0, 0, null, 62, null);
        } else {
            singleCardLabel = null;
        }
        return new DefaultSingleCardData(null, onClick, false, null, null, false, null, null, new BodySection(null, title, singleCardLabel, 1, null), null, new x0.Icon(jz.a.V, null, null, 6, null), null, 2813, null);
    }

    static /* synthetic */ DefaultSingleCardData b0(q qVar, int i15, Integer num, er.a aVar, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            num = null;
        }
        return qVar.a0(i15, num, aVar);
    }

    @Override // er.l
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public o41.c.Data b(Params params) {
        int i15;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(j31.a.X), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.c(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        mx.c cVar = this.labelProvider;
        boolean areMultipleChildren = params.getState().getAreMultipleChildren();
        if (areMultipleChildren) {
            i15 = j31.a.W;
        } else {
            if (areMultipleChildren) {
                throw new oq.p();
            }
            i15 = j31.a.V;
        }
        return new o41.c.Data(baseScaffoldData, cVar.c(i15), G(params.getState().getParentGender(), params.getState().getMaritalStatusType(), params.getState().getAreMultipleChildren(), params.a()), params.b());
    }
}
