package xw2;

import a50.RadioButtonData;
import b50.RadioButtonItemData;
import b50.RadioButtonRow;
import b50.e;
import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import k30.d;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import ww2.State;
import ww2.h;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lxw2/c;", "Lxw/f;", "Lxw2/c$a;", "Lww2/h$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "f", "(Lxw2/c$a;)Lww2/h$a;", "a", "Lmx/c;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, h.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: xw2.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001e\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b!\u0010'R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b$\u0010'¨\u0006("}, d2 = {"Lxw2/c$a;", "", "Lww2/g;", "state", "Lyw2/a;", "applicationOwner", "Lkotlin/Function1;", "Lww2/f;", "Loq/i0;", "onAnswerSelected", "Lkotlin/Function0;", "onNextClick", "onBack", "onClose", "<init>", "(Lww2/g;Lyw2/a;Ler/l;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lww2/g;", "f", "()Lww2/g;", "b", "Lyw2/a;", "()Lyw2/a;", "c", "Ler/l;", "()Ler/l;", "d", "Ler/a;", "e", "()Ler/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final yw2.a applicationOwner;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<ww2.f, i0> onAnswerSelected;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, yw2.a aVar, l<? super ww2.f, i0> lVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = state;
            this.applicationOwner = aVar;
            this.onAnswerSelected = lVar;
            this.onNextClick = aVar2;
            this.onBack = aVar3;
            this.onClose = aVar4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final yw2.a getApplicationOwner() {
            return this.applicationOwner;
        }

        public final l<ww2.f, i0> b() {
            return this.onAnswerSelected;
        }

        public final er.a<i0> c() {
            return this.onBack;
        }

        public final er.a<i0> d() {
            return this.onClose;
        }

        public final er.a<i0> e() {
            return this.onNextClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && this.applicationOwner == params.applicationOwner && t.c(this.onAnswerSelected, params.onAnswerSelected) && t.c(this.onNextClick, params.onNextClick) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.applicationOwner.hashCode()) * 31) + this.onAnswerSelected.hashCode()) * 31) + this.onNextClick.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", applicationOwner=" + this.applicationOwner + ", onAnswerSelected=" + this.onAnswerSelected + ", onNextClick=" + this.onNextClick + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f221728a;

        static {
            int[] iArr = new int[yw2.a.values().length];
            try {
                iArr[yw2.a.CHILD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yw2.a.WARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f221728a = iArr;
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params) {
        params.b().b(ww2.f.POLISH);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params) {
        params.b().b(ww2.f.NOT_POLISH);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public h.Data b(final Params params) {
        int i15;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(gv2.a.K0), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.d(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        mx.c cVar = this.labelProvider;
        int i16 = b.f221728a[params.getApplicationOwner().ordinal()];
        if (i16 == 1) {
            i15 = gv2.a.I0;
        } else {
            if (i16 != 2) {
                throw new p();
            }
            i15 = gv2.a.M0;
        }
        Label labelC = cVar.c(i15);
        RadioButtonRow radioButtonRow = new RadioButtonRow(new RadioButtonItemData(false, params.getState().getSelectedCitizenship() == ww2.f.POLISH, false, 5, null), new er.a() { // from class: xw2.a
            @Override // er.a
            public final Object a() {
                return c.h(params);
            }
        }, this.labelProvider.c(gv2.a.f77287n0), null, null, 24, null);
        ww2.f selectedCitizenship = params.getState().getSelectedCitizenship();
        ww2.f fVar = ww2.f.NOT_POLISH;
        RadioButtonItemData radioButtonItemData = new RadioButtonItemData(false, selectedCitizenship == fVar, false, 5, null);
        Label labelC2 = this.labelProvider.c(gv2.a.Q);
        ww2.f selectedCitizenship2 = params.getState().getSelectedCitizenship();
        if (selectedCitizenship2 != fVar) {
            selectedCitizenship2 = null;
        }
        return new h.Data(baseScaffoldData, new RadioButtonData(v.q(radioButtonRow, new RadioButtonRow(radioButtonItemData, new er.a() { // from class: xw2.b
            @Override // er.a
            public final Object a() {
                return c.i(params);
            }
        }, labelC2, selectedCitizenship2 != null ? this.labelProvider.c(gv2.a.L0) : null, null, 16, null)), e.a.f16684a, null, labelC, null, null, null, 116, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(gv2.a.P), null, 2, null), d.a.f107773a, null, params.e(), 35, null));
    }
}
