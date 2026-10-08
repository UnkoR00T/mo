package xw3;

import android.graphics.Bitmap;
import cw3.IdentityPhotoData;
import er.l;
import fr.t;
import fx.Rectangle;
import h30.ButtonData;
import i50.BaseScaffoldData;
import jw3.MaskDefinition;
import k30.d;
import mx.Label;
import mx.c;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import ww3.g;
import ww3.h;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0015\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\r*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u0011*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001d\u001a\u00020\u001a*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lxw3/a;", "Lxw/f;", "Lxw3/a$a;", "Lww3/h$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "l", "(Lxw3/a$a;)Lww3/h$a;", "a", "Lmx/c;", "Lww3/h$a$a;", "i", "(Lxw3/a$a;)Lww3/h$a$a;", "pictureData", "Lx50/a$a;", "h", "(Lxw3/a$a;)Lx50/a$a;", "menuType", "xw3/a$b", "e", "()Lxw3/a$b;", "adjustmentMenuIcon", "Lcw3/a$a;", "", "f", "(Lcw3/a$a;)I", "alertBodyResId", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, h.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: xw3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b \u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u0018\u0010\"¨\u0006#"}, d2 = {"Lxw3/a$a;", "", "Lww3/g;", "state", "Lkotlin/Function1;", "Lfx/e;", "Loq/i0;", "onContainerChanged", "Lkotlin/Function0;", "onChangeMaskVisibility", "onCloseClick", "onAdjustClick", "<init>", "(Lww3/g;Ler/l;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lww3/g;", "e", "()Lww3/g;", "b", "Ler/l;", "d", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final g state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Rectangle, i0> onContainerChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onChangeMaskVisibility;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAdjustClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(g gVar, l<? super Rectangle, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = gVar;
            this.onContainerChanged = lVar;
            this.onChangeMaskVisibility = aVar;
            this.onCloseClick = aVar2;
            this.onAdjustClick = aVar3;
        }

        public final er.a<i0> a() {
            return this.onAdjustClick;
        }

        public final er.a<i0> b() {
            return this.onChangeMaskVisibility;
        }

        public final er.a<i0> c() {
            return this.onCloseClick;
        }

        public final l<Rectangle, i0> d() {
            return this.onContainerChanged;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final g getState() {
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
            return t.c(this.state, params.state) && t.c(this.onContainerChanged, params.onContainerChanged) && t.c(this.onChangeMaskVisibility, params.onChangeMaskVisibility) && t.c(this.onCloseClick, params.onCloseClick) && t.c(this.onAdjustClick, params.onAdjustClick);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onContainerChanged.hashCode()) * 31) + this.onChangeMaskVisibility.hashCode()) * 31) + this.onCloseClick.hashCode()) * 31) + this.onAdjustClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onContainerChanged=" + this.onContainerChanged + ", onChangeMaskVisibility=" + this.onChangeMaskVisibility + ", onCloseClick=" + this.onCloseClick + ", onAdjustClick=" + this.onAdjustClick + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"xw3/a$b", "Lx50/a$c$c;", "", "a", "I", "b", "()I", "iconResId", "Lmx/a;", "Lmx/a;", "getContentDescription", "()Lmx/a;", "contentDescription", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements x50.a.MenuButtonData.InterfaceC5779c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int iconResId = jz.a.f106819m0;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Label contentDescription;

        b(a aVar) {
            this.contentDescription = aVar.labelProvider.c(bw3.a.f21858a);
        }

        @Override // x50.a.MenuButtonData.InterfaceC5779c
        /* JADX INFO: renamed from: b, reason: from getter */
        public int getIconResId() {
            return this.iconResId;
        }

        @Override // x50.a.MenuButtonData.InterfaceC5779c
        public Label getContentDescription() {
            return this.contentDescription;
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    private final b e() {
        return new b(this);
    }

    private final int f(IdentityPhotoData.AbstractC0815a abstractC0815a) {
        if (t.c(abstractC0815a, IdentityPhotoData.AbstractC0815a.C0816a.f38347a) || t.c(abstractC0815a, IdentityPhotoData.AbstractC0815a.d.f38356a)) {
            return bw3.a.H;
        }
        if (t.c(abstractC0815a, IdentityPhotoData.AbstractC0815a.b.f38350a)) {
            return bw3.a.I;
        }
        throw new p();
    }

    private final x50.a.Icon h(Params params) {
        boolean isAdjustmentEnabled = params.getState().getIsAdjustmentEnabled();
        Boolean boolValueOf = Boolean.valueOf(isAdjustmentEnabled);
        if (!isAdjustmentEnabled) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return new x50.a.Icon(new x50.a.MenuButtonData(e(), null, null, params.a(), 6, null));
        }
        return null;
    }

    private final h.Data.PictureData i(Params params) {
        int i15;
        int i16;
        g state = params.getState();
        g.Initialized initialized = state instanceof g.Initialized ? (g.Initialized) state : null;
        if (initialized == null) {
            return null;
        }
        p036e4.l lVarA = tw3.a.a(initialized.getScaleType());
        Bitmap bitmap = initialized.getBitmap();
        MaskDefinition maskDefinition = initialized.getIsMaskVisible() ? initialized.getMaskDefinition() : null;
        k30.a.b bVar = k30.a.b.f107765a;
        boolean isMaskVisible = initialized.getIsMaskVisible();
        if (isMaskVisible) {
            i15 = jz.a.L;
        } else {
            if (isMaskVisible) {
                throw new p();
            }
            i15 = jz.a.K;
        }
        c cVar = this.labelProvider;
        boolean isMaskVisible2 = initialized.getIsMaskVisible();
        if (isMaskVisible2) {
            i16 = bw3.a.f21896t;
        } else {
            if (isMaskVisible2) {
                throw new p();
            }
            i16 = bw3.a.f21898u;
        }
        return new h.Data.PictureData(lVarA, bitmap, maskDefinition, new ButtonData(null, null, bVar, new k30.c.WithIcon(i15, cVar.c(i16)), d.a.f107773a, null, params.b(), 35, null));
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public h.Data b(Params params) {
        return new h.Data(params.d(), new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.c()), this.labelProvider.c(bw3.a.f21891q0), null, h(params), null, 20, null), null, null, null, null, 61, null), new c30.b.c(null, null, null, this.labelProvider.c(f(params.getState().getMaskType())), null, null, null, 119, null), i(params));
    }
}
