package ay3;

import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import zx3.Error;
import zx3.View;
import zx3.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lay3/e;", "Lxw/f;", "Lay3/e$a;", "Lzx3/j$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lby3/a;", "Lhz/b;", "h", "(Lby3/a;)Lhz/b;", "params", "e", "(Lay3/e$a;)Lzx3/j$a;", "a", "Lmx/c;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, j.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ay3.e$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010 R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b!\u0010\u001d¨\u0006\""}, d2 = {"Lay3/e$a;", "", "Lzx3/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lkotlin/Function1;", "", "onBlikCodeChanged", "payWithBlik", "toInterruptionDialog", "<init>", "(Lzx3/e;Ler/a;Ler/l;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzx3/e;", "d", "()Lzx3/e;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "e", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final zx3.e state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onBlikCodeChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> payWithBlik;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> toInterruptionDialog;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(zx3.e eVar, er.a<i0> aVar, l<? super String, i0> lVar, l<? super String, i0> lVar2, er.a<i0> aVar2) {
            this.state = eVar;
            this.onBackClick = aVar;
            this.onBlikCodeChanged = lVar;
            this.payWithBlik = lVar2;
            this.toInterruptionDialog = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final l<String, i0> b() {
            return this.onBlikCodeChanged;
        }

        public final l<String, i0> c() {
            return this.payWithBlik;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final zx3.e getState() {
            return this.state;
        }

        public final er.a<i0> e() {
            return this.toInterruptionDialog;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onBlikCodeChanged, params.onBlikCodeChanged) && t.c(this.payWithBlik, params.payWithBlik) && t.c(this.toInterruptionDialog, params.toInterruptionDialog);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onBlikCodeChanged.hashCode()) * 31) + this.payWithBlik.hashCode()) * 31) + this.toInterruptionDialog.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onBlikCodeChanged=" + this.onBlikCodeChanged + ", payWithBlik=" + this.payWithBlik + ", toInterruptionDialog=" + this.toInterruptionDialog + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15249a;

        static {
            int[] iArr = new int[by3.a.values().length];
            try {
                iArr[by3.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[by3.a.EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[by3.a.WRONG_LENGTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15249a = iArr;
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params) {
        params.c().b(((zx3.e.a.BlikCode) params.getState()).getBlikCode());
        return i0.f148189a;
    }

    private final hz.b h(by3.a aVar) {
        int i15 = b.f15249a[aVar.ordinal()];
        if (i15 == 1) {
            return hz.b.C2039b.f86846c;
        }
        if (i15 == 2) {
            return new hz.b.Invalid(this.labelProvider.c(px3.b.f163142p));
        }
        if (i15 == 3) {
            return new hz.b.Invalid(this.labelProvider.c(px3.b.f163143q));
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public j.a b(final Params params) {
        zx3.e state = params.getState();
        if (state instanceof View) {
            return j.a.c.f238452a;
        }
        if (state instanceof Error) {
            return new j.a.Error(((Error) params.getState()).getErrorVMS());
        }
        if (state instanceof zx3.e.a.BlikCode) {
            return new j.a.Blik(this.labelProvider.c(px3.b.f163141o), new v50.c.Masked(null, this.labelProvider.c(px3.b.f163139m), mx.b.b(((zx3.e.a.BlikCode) params.getState()).getBlikCode(), "blikCode"), null, h(((zx3.e.a.BlikCode) params.getState()).getBlikCodeValidationState()), null, null, params.b(), null, false, 0, null, false, null, true, null, null, 0, null, w50.a.BLIK, 507753, null), new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(px3.b.f163140n), null, null, null, 28, null), null, null, null, null, 61, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(px3.b.Y), null, 2, null), k30.d.a.f107773a, null, new er.a() { // from class: ay3.d
                @Override // er.a
                public final Object a() {
                    return e.f(params);
                }
            }, 35, null));
        }
        if ((state instanceof zx3.View) || (state instanceof zx3.View)) {
            return new j.a.Confirmation(this.labelProvider.c(px3.b.E), params.e());
        }
        if (state instanceof zx3.Error) {
            return new j.a.Error(((zx3.Error) params.getState()).getErrorVMS());
        }
        if (state instanceof zx3.Error) {
            return new j.a.Error(((zx3.Error) params.getState()).getErrorVMS());
        }
        throw new p();
    }
}
