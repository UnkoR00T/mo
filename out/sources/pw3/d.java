package pw3;

import androidx.compose.ui.graphics.Color;
import cw3.IdentityPhotoData;
import er.l;
import er.p;
import fr.t;
import fx.Rectangle;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u00020\u0015*\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lpw3/d;", "Lxw/f;", "Lpw3/d$a;", "Llw3/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Llw3/c;", "Lkotlin/Function0;", "Loq/i0;", "onClick", "Lx50/a$a;", "h", "(Llw3/c;Ler/a;)Lx50/a$a;", "params", "i", "(Lpw3/d$a;)Llw3/d$a;", "a", "Lmx/c;", "Lcw3/a$a;", "", "f", "(Lcw3/a$a;)I", "descriptionStringId", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, lw3.d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: pw3.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b!\u0010*R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0006¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b%\u0010*¨\u0006+"}, d2 = {"Lpw3/d$a;", "", "Lqw3/b;", "adjustmentVMS", "Lyw3/a;", "faceValidationVMS", "Llw3/c;", "state", "Lkotlin/Function1;", "Lfx/e;", "Loq/i0;", "onContainerChanged", "Lkotlin/Function0;", "onAdjustmentAccepted", "onCloseClick", "<init>", "(Lqw3/b;Lyw3/a;Llw3/c;Ler/l;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqw3/b;", "()Lqw3/b;", "b", "Lyw3/a;", "()Lyw3/a;", "c", "Llw3/c;", "f", "()Llw3/c;", "d", "Ler/l;", "e", "()Ler/l;", "Ler/a;", "()Ler/a;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final qw3.b adjustmentVMS;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final yw3.a faceValidationVMS;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final lw3.c state;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Rectangle, i0> onContainerChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAdjustmentAccepted;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(qw3.b bVar, yw3.a aVar, lw3.c cVar, l<? super Rectangle, i0> lVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.adjustmentVMS = bVar;
            this.faceValidationVMS = aVar;
            this.state = cVar;
            this.onContainerChanged = lVar;
            this.onAdjustmentAccepted = aVar2;
            this.onCloseClick = aVar3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final qw3.b getAdjustmentVMS() {
            return this.adjustmentVMS;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final yw3.a getFaceValidationVMS() {
            return this.faceValidationVMS;
        }

        public final er.a<i0> c() {
            return this.onAdjustmentAccepted;
        }

        public final er.a<i0> d() {
            return this.onCloseClick;
        }

        public final l<Rectangle, i0> e() {
            return this.onContainerChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.adjustmentVMS, params.adjustmentVMS) && t.c(this.faceValidationVMS, params.faceValidationVMS) && t.c(this.state, params.state) && t.c(this.onContainerChanged, params.onContainerChanged) && t.c(this.onAdjustmentAccepted, params.onAdjustmentAccepted) && t.c(this.onCloseClick, params.onCloseClick);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final lw3.c getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.adjustmentVMS.hashCode() * 31) + this.faceValidationVMS.hashCode()) * 31) + this.state.hashCode()) * 31) + this.onContainerChanged.hashCode()) * 31) + this.onAdjustmentAccepted.hashCode()) * 31) + this.onCloseClick.hashCode();
        }

        public String toString() {
            return "Params(adjustmentVMS=" + this.adjustmentVMS + ", faceValidationVMS=" + this.faceValidationVMS + ", state=" + this.state + ", onContainerChanged=" + this.onContainerChanged + ", onAdjustmentAccepted=" + this.onAdjustmentAccepted + ", onCloseClick=" + this.onCloseClick + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"pw3/d$b", "Lx50/a$c$c;", "", "a", "I", "b", "()I", "iconResId", "Lmx/a;", "Lmx/a;", "getContentDescription", "()Lmx/a;", "contentDescription", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements x50.a.MenuButtonData.InterfaceC5779c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int iconResId = jz.a.T1;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Label contentDescription;

        b(d dVar) {
            this.contentDescription = dVar.labelProvider.c(bw3.a.f21876j);
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

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ lw3.c.Initialized.EnumC2953a f163079a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f163080a;

            static {
                int[] iArr = new int[lw3.c.Initialized.EnumC2953a.values().length];
                try {
                    iArr[lw3.c.Initialized.EnumC2953a.MODIFYING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f163080a = iArr;
            }
        }

        c(lw3.c.Initialized.EnumC2953a enumC2953a) {
            this.f163079a = enumC2953a;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            long jB;
            rVar.X(-2116935209);
            if (p076m2.t.k()) {
                p076m2.t.o(-2116935209, i15, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.adjustment.mapper.AdjustmentMapper.getMenuType.<anonymous>.<anonymous> (AdjustmentMapper.kt:96)");
            }
            if (a.f163080a[this.f163079a.ordinal()] == 1) {
                rVar.X(1439765664);
                jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().k();
                rVar.R();
            } else {
                rVar.X(1439767521);
                jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
                rVar.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final int f(IdentityPhotoData.AbstractC0815a abstractC0815a) {
        return t.c(abstractC0815a, IdentityPhotoData.AbstractC0815a.b.f38350a) ? bw3.a.f21903x : bw3.a.f21904y;
    }

    private final x50.a.Icon h(lw3.c cVar, er.a<i0> aVar) {
        lw3.c.Initialized.EnumC2953a photoState;
        lw3.c.Initialized initialized = cVar instanceof lw3.c.Initialized ? (lw3.c.Initialized) cVar : null;
        if (initialized != null && (photoState = initialized.getPhotoState()) != null) {
            if (photoState == lw3.c.Initialized.EnumC2953a.INITIAL) {
                photoState = null;
            }
            if (photoState != null) {
                return new x50.a.Icon(new x50.a.MenuButtonData(new b(this), new c(photoState), null, aVar, 4, null));
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params) {
        params.getAdjustmentVMS().c();
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public lw3.d.Data b(final Params params) {
        int iF;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.d()), this.labelProvider.c(bw3.a.D), null, h(params.getState(), params.c()), null, 20, null), null, null, null, null, 61, null);
        mx.c cVar = this.labelProvider;
        lw3.c state = params.getState();
        if (state instanceof lw3.c.Measuring) {
            iF = f(((lw3.c.Measuring) state).getMaskType());
        } else {
            if (!(state instanceof lw3.c.Initialized)) {
                throw new oq.p();
            }
            iF = f(((lw3.c.Initialized) state).getMaskDefinition().getMaskType());
        }
        Label labelC = cVar.c(iF);
        Label labelC2 = this.labelProvider.c(bw3.a.f21905z);
        qw3.b adjustmentVMS = params.getAdjustmentVMS();
        l<Rectangle, i0> lVarE = params.e();
        lw3.c state2 = params.getState();
        lw3.c.Initialized initialized = state2 instanceof lw3.c.Initialized ? (lw3.c.Initialized) state2 : null;
        return new lw3.d.Data(baseScaffoldData, labelC, labelC2, adjustmentVMS, params.getFaceValidationVMS(), lVarE, initialized != null ? new lw3.d.Data.PictureData(initialized.getPhoto(), initialized.getMaskDefinition()) : null, new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithIcon(jz.a.f106826n0, this.labelProvider.c(bw3.a.f21886o)), k30.d.a.f107773a, null, new er.a() { // from class: pw3.c
            @Override // er.a
            public final Object a() {
                return d.l(params);
            }
        }, 35, null), params.d());
    }
}
