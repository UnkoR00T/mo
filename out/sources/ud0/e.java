package ud0;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import rd0.SetPinThemeColors;
import x50.NavigationButtonData;
import x50.i;
import x60.BasicPinInputScreenData;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lud0/e;", "Lxw/f;", "Lud0/e$a;", "Ltd0/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "i", "(Lud0/e$a;)Ltd0/c$a;", "a", "Lmx/c;", "setpin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, td0.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ud0.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lud0/e$a;", "", "Ltd0/b;", "state", "Lkotlin/Function1;", "Liy/b0;", "Loq/i0;", "onPinChanged", "Lkotlin/Function0;", "backAction", "<init>", "(Ltd0/b;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltd0/b;", "c", "()Ltd0/b;", "b", "Ler/l;", "()Ler/l;", "Ler/a;", "()Ler/a;", "setpin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final td0.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onPinChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(td0.b bVar, l<? super b0, i0> lVar, er.a<i0> aVar) {
            this.state = bVar;
            this.onPinChanged = lVar;
            this.backAction = aVar;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final l<b0, i0> b() {
            return this.onPinChanged;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final td0.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onPinChanged, params.onPinChanged) && t.c(this.backAction, params.backAction);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onPinChanged.hashCode()) * 31) + this.backAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onPinChanged=" + this.onPinChanged + ", backAction=" + this.backAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f197609a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-2120788868);
            if (p076m2.t.k()) {
                p076m2.t.o(-2120788868, i15, -1, "pl.gov.coi.mjunior.feature.setpin.presentation.screen.onboarding.pin.mapper.SetPinMapper.invoke.<anonymous> (SetPinMapper.kt:46)");
            }
            long headerIconBackground = ((SetPinThemeColors) rVar.N(rd0.e.e())).getHeaderIconBackground();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return headerIconBackground;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f197610a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1134367960);
            if (p076m2.t.k()) {
                p076m2.t.o(1134367960, i15, -1, "pl.gov.coi.mjunior.feature.setpin.presentation.screen.onboarding.pin.mapper.SetPinMapper.invoke.<anonymous> (SetPinMapper.kt:76)");
            }
            long headerIconBackground = ((SetPinThemeColors) rVar.N(rd0.e.e())).getHeaderIconBackground();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return headerIconBackground;
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, String str) {
        params.b().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params, String str) {
        params.b().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r() {
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public td0.c.a b(final Params params) {
        td0.b state = params.getState();
        if (state instanceof td0.b.SetPin) {
            return new td0.c.a.SetPinData(new BasicPinInputScreenData(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), null, null, null, null, 30, null), null, null, this.labelProvider.c(pd0.a.f157004o), null, 45, null), new o40.a.Icon(jz.a.f106790i, null, b.f197609a, this.labelProvider.c(pd0.a.f157004o), this.labelProvider.c(pd0.a.f157001l), null, 34, null), new v50.c.Pin(null, null, mx.b.b(c0.e(((td0.b.SetPin) params.getState()).getPinValue()), "pinTag"), ((td0.b.SetPin) params.getState()).getValidationState(), null, null, new l() { // from class: ud0.a
                @Override // er.l
                public final Object b(Object obj) {
                    return e.l(params, (String) obj);
                }
            }, null, false, 0, null, false, null, false, null, null, 6, null, 196531, null), true, new er.a() { // from class: ud0.b
                @Override // er.a
                public final Object a() {
                    return e.m();
                }
            }), params.a());
        }
        if (state instanceof td0.b.RepeatPin) {
            return new td0.c.a.SetPinData(new BasicPinInputScreenData(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), null, null, null, null, 30, null), null, null, null, null, 61, null), new o40.a.Icon(jz.a.f106790i, null, c.f197610a, this.labelProvider.c(pd0.a.f157000k), this.labelProvider.c(pd0.a.f156999j), null, 34, null), new v50.c.Pin(null, null, mx.b.b(c0.e(((td0.b.RepeatPin) params.getState()).getRepeatedPinValue()), "pinTag"), ((td0.b.RepeatPin) params.getState()).getValidationState(), null, null, new l() { // from class: ud0.c
                @Override // er.l
                public final Object b(Object obj) {
                    return e.q(params, (String) obj);
                }
            }, null, false, 0, null, false, null, false, null, null, 6, null, 196531, null), true, new er.a() { // from class: ud0.d
                @Override // er.a
                public final Object a() {
                    return e.r();
                }
            }), params.a());
        }
        if (state instanceof td0.b.Error) {
            return new td0.c.a.Error(((td0.b.Error) params.getState()).getErrorVMS());
        }
        throw new oq.p();
    }
}
