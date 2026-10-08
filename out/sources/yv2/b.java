package yv2;

import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import k30.c;
import k30.d;
import mv2.CustomErrorData;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import q40.IconPageData;
import q40.j;
import x50.NavigationButtonData;
import x50.i;
import xv2.State;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lyv2/b;", "Lxw/f;", "Lyv2/b$a;", "Lxv2/f$a;", "<init>", "()V", "params", "h", "(Lyv2/b$a;)Lxv2/f$a;", "Lkotlin/Function0;", "Loq/i0;", "f", "(Lyv2/b$a;)Ler/a;", "closeAction", "a", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, xv2.f.Data> {

    /* JADX INFO: renamed from: yv2.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lyv2/b$a;", "", "Lxv2/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onCloseClick", "<init>", "(Lxv2/e;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxv2/e;", "b", "()Lxv2/e;", "Ler/a;", "()Ler/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        public Params(State state, er.a<i0> aVar) {
            this.state = state;
            this.onCloseClick = aVar;
        }

        public final er.a<i0> a() {
            return this.onCloseClick;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.onCloseClick, params.onCloseClick);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onCloseClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCloseClick=" + this.onCloseClick + ')';
        }
    }

    /* JADX INFO: renamed from: yv2.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C6173b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f229967a;

        static {
            int[] iArr = new int[CustomErrorData.EnumC3191a.values().length];
            try {
                iArr[CustomErrorData.EnumC3191a.BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomErrorData.EnumC3191a.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f229967a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(Params params) {
        params.a().a();
        params.getState().getData().d().a();
        return i0.f148189a;
    }

    private final er.a<i0> f(final Params params) {
        return new er.a() { // from class: yv2.a
            @Override // er.a
            public final Object a() {
                return b.e(params);
            }
        };
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public xv2.f.Data b(Params params) {
        NavigationButtonData.a.Icon iconA;
        ButtonData buttonData;
        int i15 = C6173b.f229967a[params.getState().getData().getNavigationIcon().ordinal()];
        if (i15 == 1) {
            iconA = NavigationButtonData.a.Icon.INSTANCE.a();
        } else {
            if (i15 != 2) {
                throw new p();
            }
            iconA = NavigationButtonData.a.Icon.INSTANCE.b();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(iconA, f(params)), null, null, null, null, 30, null), null, null, null, null, 61, null);
        j.a aVar = new j.a(jz.a.f106793i2);
        Label title = params.getState().getData().getTitle();
        Label message = params.getState().getData().getMessage();
        Label buttonLabel = params.getState().getData().getButtonLabel();
        if (buttonLabel != null) {
            buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new c.WithText(buttonLabel, null, 2, null), d.a.f107773a, null, f(params), 35, null);
        } else {
            buttonData = null;
        }
        return new xv2.f.Data(baseScaffoldData, new IconPageData(aVar, title, message, null, null, buttonData, false, 72, null), f(params));
    }
}
