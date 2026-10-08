package kx2;

import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import ix2.State;
import ix2.l;
import ix2.m;
import k30.d;
import mx.c;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkx2/a;", "Lxw/f;", "Lkx2/a$a;", "Lix2/l$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lkx2/a$a;)Lix2/l$a;", "a", "Lmx/c;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, l.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: kx2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\"\u0010!R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b#\u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b'\u0010&R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b\u001a\u0010&R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010$\u001a\u0004\b\u001e\u0010&¨\u0006("}, d2 = {"Lkx2/a$a;", "", "Lix2/k;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onFathersNameChanged", "onMothersNameChanged", "onMothersMaidenNameChanged", "Lkotlin/Function0;", "onScrolledToField", "onNextButtonClick", "onBack", "onClose", "<init>", "(Lix2/k;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lix2/k;", "h", "()Lix2/k;", "b", "Ler/l;", "c", "()Ler/l;", "e", "d", "Ler/a;", "g", "()Ler/a;", "f", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f113007i = hz.b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onFathersNameChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onMothersNameChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onMothersMaidenNameChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToField;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClick;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.l<? super String, i0> lVar, er.l<? super String, i0> lVar2, er.l<? super String, i0> lVar3, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = state;
            this.onFathersNameChanged = lVar;
            this.onMothersNameChanged = lVar2;
            this.onMothersMaidenNameChanged = lVar3;
            this.onScrolledToField = aVar;
            this.onNextButtonClick = aVar2;
            this.onBack = aVar3;
            this.onClose = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        public final er.l<String, i0> c() {
            return this.onFathersNameChanged;
        }

        public final er.l<String, i0> d() {
            return this.onMothersMaidenNameChanged;
        }

        public final er.l<String, i0> e() {
            return this.onMothersNameChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onFathersNameChanged, params.onFathersNameChanged) && t.c(this.onMothersNameChanged, params.onMothersNameChanged) && t.c(this.onMothersMaidenNameChanged, params.onMothersMaidenNameChanged) && t.c(this.onScrolledToField, params.onScrolledToField) && t.c(this.onNextButtonClick, params.onNextButtonClick) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose);
        }

        public final er.a<i0> f() {
            return this.onNextButtonClick;
        }

        public final er.a<i0> g() {
            return this.onScrolledToField;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.onFathersNameChanged.hashCode()) * 31) + this.onMothersNameChanged.hashCode()) * 31) + this.onMothersMaidenNameChanged.hashCode()) * 31) + this.onScrolledToField.hashCode()) * 31) + this.onNextButtonClick.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onFathersNameChanged=" + this.onFathersNameChanged + ", onMothersNameChanged=" + this.onMothersNameChanged + ", onMothersMaidenNameChanged=" + this.onMothersMaidenNameChanged + ", onScrolledToField=" + this.onScrolledToField + ", onNextButtonClick=" + this.onNextButtonClick + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f113016a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.PARENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.GUARDIAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f113016a = iArr;
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public l.Data b(Params params) {
        int i15;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(gv2.a.S1), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        c cVar = this.labelProvider;
        int i16 = b.f113016a[params.getState().getParentsDataRequester().ordinal()];
        if (i16 == 1) {
            i15 = gv2.a.F0;
        } else {
            if (i16 != 2) {
                throw new p();
            }
            i15 = gv2.a.W2;
        }
        return new l.Data(baseScaffoldData, cVar.c(i15), v.q(new l.FieldData(ix2.a.FATHERS_NAME, new v50.c.Text(null, this.labelProvider.c(gv2.a.f77322w), null, mx.b.b(params.getState().getFathersName().getValue(), "fathersName"), params.getState().getFathersName().getValidationState(), null, null, params.c(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null)), new l.FieldData(ix2.a.MOTHERS_NAME, new v50.c.Text(null, this.labelProvider.c(gv2.a.O), null, mx.b.b(params.getState().getMothersName().getValue(), "mothersName"), params.getState().getMothersName().getValidationState(), null, null, params.e(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null)), new l.FieldData(ix2.a.MOTHERS_MAIDEN_NAME, new v50.c.Text(null, this.labelProvider.c(gv2.a.N), null, mx.b.b(params.getState().getMothersMaidenName().getValue(), "mothersMaidenName"), params.getState().getMothersMaidenName().getValidationState(), null, null, params.d(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null))), params.getState().getScrollToField(), params.g(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(gv2.a.I), null, 2, null), d.a.f107773a, null, params.f(), 35, null));
    }
}
