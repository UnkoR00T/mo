package p43;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import f43.ChildStudent;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.i;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0013\u001a\u00020\u0012*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lp43/b;", "Lxw/f;", "Lp43/b$a;", "Ln43/c$a;", "Lmx/c;", "labelProvider", "Lrz/a;", "bitmapDecoder", "Liy/a;", "base64Coder", "<init>", "(Lmx/c;Lrz/a;Liy/a;)V", "Lf43/a;", "Lkotlin/Function0;", "Loq/i0;", "onClick", "Landroid/graphics/Bitmap;", "bitmap", "Ln50/g;", "h", "(Lf43/a;Ler/a;Landroid/graphics/Bitmap;)Ln50/g;", "params", "e", "(Lp43/b$a;)Ln43/c$a;", "a", "Lmx/c;", "b", "Lrz/a;", "c", "Liy/a;", "schooldashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, n43.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rz.a bitmapDecoder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: p43.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Lp43/b$a;", "", "Ln43/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lkotlin/Function1;", "Lf43/a;", "onChildSelected", "<init>", "(Ln43/b;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln43/b;", "c", "()Ln43/b;", "b", "Ler/a;", "()Ler/a;", "Ler/l;", "()Ler/l;", "schooldashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final n43.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<ChildStudent, i0> onChildSelected;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(n43.b bVar, er.a<i0> aVar, l<? super ChildStudent, i0> lVar) {
            this.state = bVar;
            this.onBack = aVar;
            this.onChildSelected = lVar;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final l<ChildStudent, i0> b() {
            return this.onChildSelected;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final n43.b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onChildSelected, params.onChildSelected);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onChildSelected.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onChildSelected=" + this.onChildSelected + ')';
        }
    }

    /* JADX INFO: renamed from: p43.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3759b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3759b f153008a = new C3759b();

        C3759b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1741229698);
            if (p076m2.t.k()) {
                p076m2.t.o(-1741229698, i15, -1, "pl.gov.coi.mobywatel.feature.schooldashboard.presentation.screens.welcomepage.mapper.SchoolWelcomePageMapper.invoke.<anonymous> (SchoolWelcomePageMapper.kt:56)");
            }
            long jA = ((h43.a) rVar.N(h43.c.c())).a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f153009a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1410017060);
            if (p076m2.t.k()) {
                p076m2.t.o(1410017060, i15, -1, "pl.gov.coi.mobywatel.feature.schooldashboard.presentation.screens.welcomepage.mapper.SchoolWelcomePageMapper.toSingleCardData.<anonymous> (SchoolWelcomePageMapper.kt:89)");
            }
            long jA = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public b(mx.c cVar, rz.a aVar, iy.a aVar2) {
        this.labelProvider = cVar;
        this.bitmapDecoder = aVar;
        this.base64Coder = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, ChildStudent childStudent) {
        params.b().b(childStudent);
        return i0.f148189a;
    }

    private final DefaultSingleCardData h(ChildStudent childStudent, er.a<i0> aVar, Bitmap bitmap) {
        return new DefaultSingleCardData(null, aVar, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(childStudent.getName(), "ChildName_" + childStudent.getId()), null, null, 0, 0, null, 62, null)), new SingleCardLabel(mx.b.b(childStudent.getSchoolName(), "ChildSchoolName_" + childStudent.getId()), null, null, 0, 0, null, 62, null), 1, null), new LeadingSection(false, null, bitmap != null ? new i.Image(bitmap, null, null, 6, null) : new i.RoundedSquareIcon(jz.a.G0, null, null, null, c.f153009a, null, null, null, 238, null), 3, null), x0.Icon.INSTANCE.b(), null, 2301, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public n43.c.a b(final Params params) {
        Object objB;
        n43.b state = params.getState();
        if (state instanceof n43.b.c) {
            return n43.c.a.C3270c.f131739a;
        }
        if (!(state instanceof n43.b.DisplayingList)) {
            if (state instanceof n43.b.ErrorLoadingList) {
                return new n43.c.a.ErrorLoadingList(((n43.b.ErrorLoadingList) state).getErrorVMS());
            }
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(c43.a.f23387n), null, null, null, 28, null), null, null, null, null, 61, null);
        o40.a.Icon icon = new o40.a.Icon(jz.a.f106830n4, null, C3759b.f153008a, this.labelProvider.c(c43.a.f23386m), this.labelProvider.c(c43.a.f23385l), null, 34, null);
        List<ChildStudent> listA = ((n43.b.DisplayingList) state).a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        for (final ChildStudent childStudent : listA) {
            er.a<i0> aVar = new er.a() { // from class: p43.a
                @Override // er.a
                public final Object a() {
                    return b.f(params, childStudent);
                }
            };
            String picture = childStudent.getPicture();
            Bitmap bitmapA = null;
            if (picture != null) {
                rz.a aVar2 = this.bitmapDecoder;
                dx.i iVarC = iy.a.c(this.base64Coder, picture, null, 2, null);
                if (iVarC instanceof dx.i.Left) {
                    objB = new byte[0];
                } else {
                    if (!(iVarC instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    objB = ((dx.i.Right) iVarC).b();
                }
                bitmapA = aVar2.a((byte[]) objB);
            }
            arrayList.add(h(childStudent, aVar, bitmapA));
        }
        return new n43.c.a.DisplayingList(baseScaffoldData, icon, new CardListData(arrayList, null, false, null, null, 30, null), params.a());
    }
}
