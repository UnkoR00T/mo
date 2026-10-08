package my2;

import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k30.d;
import ly2.g;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import t40.InfoRowListData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u000f*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lmy2/c;", "Lxw/f;", "Lmy2/c$a;", "Lly2/g$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "f", "(Lmy2/c$a;)Lly2/g$a;", "a", "Lmx/c;", "Lly2/f$d;", "", "", "c", "(Lly2/f$d;)Ljava/util/List;", "bulletsResIds", "e", "(Lly2/f$d;)Ljava/lang/Integer;", "photoBulletResId", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, g.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: my2.c$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u0016\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001f"}, d2 = {"Lmy2/c$a;", "", "Lly2/f;", "state", "Lkotlin/Function0;", "Loq/i0;", "onTopBarBackIconClick", "onTopBarInfoIconClick", "onBackPressed", "onSubmitApplicationButtonClick", "<init>", "(Lly2/f;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lly2/f;", "e", "()Lly2/f;", "b", "Ler/a;", "c", "()Ler/a;", "d", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ly2.f state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onTopBarBackIconClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onTopBarInfoIconClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackPressed;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSubmitApplicationButtonClick;

        public Params(ly2.f fVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = fVar;
            this.onTopBarBackIconClick = aVar;
            this.onTopBarInfoIconClick = aVar2;
            this.onBackPressed = aVar3;
            this.onSubmitApplicationButtonClick = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBackPressed;
        }

        public final er.a<i0> b() {
            return this.onSubmitApplicationButtonClick;
        }

        public final er.a<i0> c() {
            return this.onTopBarBackIconClick;
        }

        public final er.a<i0> d() {
            return this.onTopBarInfoIconClick;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ly2.f getState() {
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
            return t.c(this.state, params.state) && t.c(this.onTopBarBackIconClick, params.onTopBarBackIconClick) && t.c(this.onTopBarInfoIconClick, params.onTopBarInfoIconClick) && t.c(this.onBackPressed, params.onBackPressed) && t.c(this.onSubmitApplicationButtonClick, params.onSubmitApplicationButtonClick);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onTopBarBackIconClick.hashCode()) * 31) + this.onTopBarInfoIconClick.hashCode()) * 31) + this.onBackPressed.hashCode()) * 31) + this.onSubmitApplicationButtonClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onTopBarBackIconClick=" + this.onTopBarBackIconClick + ", onTopBarInfoIconClick=" + this.onTopBarInfoIconClick + ", onBackPressed=" + this.onBackPressed + ", onSubmitApplicationButtonClick=" + this.onSubmitApplicationButtonClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f129497a;

        static {
            int[] iArr = new int[lv2.a.values().length];
            try {
                iArr[lv2.a.MYSELF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lv2.a.CHILD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lv2.a.WARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f129497a = iArr;
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final List<Integer> c(ly2.f.d dVar) {
        int i15 = b.f129497a[dVar.getApplicationOwner().ordinal()];
        if (i15 == 1) {
            return v.s(Integer.valueOf(gv2.a.f77229a3), e(dVar), Integer.valueOf(gv2.a.f77234b3));
        }
        if (i15 == 2) {
            return v.s(Integer.valueOf(gv2.a.f77229a3), e(dVar), Integer.valueOf(gv2.a.X2), Integer.valueOf(gv2.a.Y2));
        }
        if (i15 == 3) {
            return v.s(Integer.valueOf(gv2.a.f77229a3), e(dVar), Integer.valueOf(gv2.a.f77259g3), Integer.valueOf(gv2.a.f77264h3));
        }
        throw new p();
    }

    private final Integer e(ly2.f.d dVar) {
        boolean isIdentityPhotoFeatureEnabled = dVar.getIsIdentityPhotoFeatureEnabled();
        Boolean boolValueOf = Boolean.valueOf(isIdentityPhotoFeatureEnabled);
        if (!isIdentityPhotoFeatureEnabled) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return Integer.valueOf(gv2.a.f77249e3);
        }
        return null;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public g.a b(Params params) {
        int i15;
        ly2.f state = params.getState();
        if (state instanceof ly2.f.a) {
            return new g.a.Error(((ly2.f.a) params.getState()).getVmsAdapter());
        }
        if (!(state instanceof ly2.f.d)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(gv2.a.f77244d3), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216848d, null, null, params.d(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        mx.c cVar = this.labelProvider;
        int i16 = b.f129497a[((ly2.f.d) params.getState()).getApplicationOwner().ordinal()];
        if (i16 == 1) {
            i15 = gv2.a.f77239c3;
        } else if (i16 == 2) {
            i15 = gv2.a.Z2;
        } else {
            if (i16 != 3) {
                throw new p();
            }
            i15 = gv2.a.f77269i3;
        }
        Label labelC = cVar.c(i15);
        List<Integer> listC = c((ly2.f.d) params.getState());
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(new t40.a.C4874a(this.labelProvider.c(((Number) it.next()).intValue())));
        }
        return new g.a.Initialized(baseScaffoldData, labelC, new InfoRowListData(arrayList), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(gv2.a.f77254f3), null, 2, null), d.a.f107773a, null, params.b(), 35, null), params.a());
    }
}
