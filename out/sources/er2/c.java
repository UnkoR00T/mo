package er2;

import cr2.d;
import er.l;
import fr.k;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.c0;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageData;
import q40.j;
import uq2.PassportVisualization;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000f\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Ler2/c;", "Lxw/f;", "Ler2/c$b;", "Lcr2/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "f", "(Ler2/c$b;)Lcr2/d$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "b", "passportinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, d.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f52953b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f52954c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ler2/c$a;", "", "<init>", "()V", "", "FIRST_ELEMENT_INDEX", "I", "", "PASSPORT_NUMBER_VALUE", "Ljava/lang/String;", "passportinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: er2.c$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Ler2/c$b;", "", "Lcr2/c;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onChoosePassport", "Lkotlin/Function0;", "onBack", "<init>", "(Lcr2/c;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcr2/c;", "c", "()Lcr2/c;", "b", "Ler/l;", "()Ler/l;", "Ler/a;", "()Ler/a;", "passportinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final cr2.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Integer, i0> onChoosePassport;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(cr2.c cVar, l<? super Integer, i0> lVar, er.a<i0> aVar) {
            this.state = cVar;
            this.onChoosePassport = lVar;
            this.onBack = aVar;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final l<Integer, i0> b() {
            return this.onChoosePassport;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final cr2.c getState() {
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
            return t.c(this.state, params.state) && t.c(this.onChoosePassport, params.onChoosePassport) && t.c(this.onBack, params.onBack);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onChoosePassport.hashCode()) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onChoosePassport=" + this.onChoosePassport + ", onBack=" + this.onBack + ')';
        }
    }

    /* JADX INFO: renamed from: er2.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C1248c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52959a;

        static {
            int[] iArr = new int[uq2.f.values().length];
            try {
                iArr[uq2.f.TEMPORARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[uq2.f.DIPLOMATIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[uq2.f.BUSINESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[uq2.f.BIOMETRIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[uq2.f.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f52959a = iArr;
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, int i15) {
        params.b().b(Integer.valueOf(i15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params) {
        params.b().b(0);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public d.a b(final Params params) {
        int i15;
        mx.c cVar = this.labelProvider;
        cr2.c state = params.getState();
        if (t.c(state, cr2.c.b.f37369a)) {
            return d.a.b.f37373a;
        }
        if (state instanceof cr2.c.a) {
            return new d.a.Empty(new IconPageData(new j.a(jz.a.f106807k2), cVar.c(qq2.a.N), null, null, null, null, false, 76, null));
        }
        if (!(state instanceof cr2.c.Initialized)) {
            throw new p();
        }
        cr2.c.Initialized initialized = (cr2.c.Initialized) state;
        boolean z15 = initialized.a().size() > 1;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, null, null, null, null, null, 63, null);
        Label labelC = cVar.c(z15 ? qq2.a.O : qq2.a.P);
        Label labelC2 = cVar.c(qq2.a.Q);
        List<PassportVisualization> listA = initialized.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        final int i16 = 0;
        for (Object obj : listA) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                v.x();
            }
            PassportVisualization passportVisualization = (PassportVisualization) obj;
            x0.Icon iconB = z15 ? x0.Icon.INSTANCE.b() : null;
            mx.c cVar2 = this.labelProvider;
            int i18 = C1248c.f52959a[passportVisualization.getType().ordinal()];
            if (i18 == 1) {
                i15 = qq2.a.f168112e0;
            } else if (i18 == 2) {
                i15 = qq2.a.K;
            } else if (i18 == 3) {
                i15 = qq2.a.f168135z;
            } else {
                if (i18 != 4 && i18 != 5) {
                    throw new p();
                }
                i15 = qq2.a.H;
            }
            arrayList.add(new DefaultSingleCardData(null, z15 ? new er.a() { // from class: er2.a
                @Override // er.a
                public final Object a() {
                    return c.h(params, i16);
                }
            } : null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(cVar2.c(i15), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(passportVisualization.getNumber()), "PassportNumberValue_" + i16), null, null, 0, 0, null, 62, null)), null, 4, null), null, iconB, null, 2813, null));
            i16 = i17;
        }
        return new d.a.Initialized(baseScaffoldData, labelC, labelC2, arrayList, initialized.a().size() == 1 ? new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(cVar.c(qq2.a.f168121l), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: er2.b
            @Override // er.a
            public final Object a() {
                return c.i(params);
            }
        }, 35, null) : null, params.a());
    }
}
