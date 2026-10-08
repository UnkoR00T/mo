package r94;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.t;
import i50.BaseScaffoldData;
import j94.PartialBehaviourGrade;
import j94.g;
import java.time.format.DateTimeFormatter;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p94.h;
import p94.i;
import pq.v;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lr94/a;", "Lxw/f;", "Lr94/a$a;", "Lp94/i$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lp94/h$a;", "state", "params", "Lp94/i$a$a;", "c", "(Lp94/h$a;Lr94/a$a;)Lp94/i$a$a;", "Lj94/g;", "type", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Li50/a;", "f", "(Lj94/g;Ler/a;)Li50/a;", "Lj94/f;", "grade", "Ln30/b;", "e", "(Lj94/f;)Ln30/b;", "h", "(Lr94/a$a;)Lp94/i$a;", "a", "Lmx/c;", "schoolbehavior_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements xw.f<Params, i.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: r94.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lr94/a$a;", "", "Lp94/h;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "<init>", "(Lp94/h;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lp94/h;", "b", "()Lp94/h;", "Ler/a;", "()Ler/a;", "schoolbehavior_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final h state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        public Params(h hVar, er.a<i0> aVar) {
            this.state = hVar;
            this.onBack = aVar;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final h getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f172539a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f172539a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f172540a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(189363881);
            if (p076m2.t.k()) {
                p076m2.t.o(189363881, i15, -1, "pl.gov.coi.shared.feature.schoolbehavior.presentation.screens.gradedetails.mapper.BehaviorGradeDetailsMapper.buildDisplayingData.<anonymous> (BehaviorGradeDetailsMapper.kt:53)");
            }
            long jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().d();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jD;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f172541a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-153519928);
            if (p076m2.t.k()) {
                p076m2.t.o(-153519928, i15, -1, "pl.gov.coi.shared.feature.schoolbehavior.presentation.screens.gradedetails.mapper.BehaviorGradeDetailsMapper.buildDisplayingData.<anonymous> (BehaviorGradeDetailsMapper.kt:54)");
            }
            long jA = k70.a.f108864a.a(rVar, k70.a.f108865b).getSurface().a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f172542a = new e();

        e() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1637338048);
            if (p076m2.t.k()) {
                p076m2.t.o(1637338048, i15, -1, "pl.gov.coi.shared.feature.schoolbehavior.presentation.screens.gradedetails.mapper.BehaviorGradeDetailsMapper.buildDisplayingData.<anonymous> (BehaviorGradeDetailsMapper.kt:61)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jG;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f172543a = new f();

        f() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1395640735);
            if (p076m2.t.k()) {
                p076m2.t.o(1395640735, i15, -1, "pl.gov.coi.shared.feature.schoolbehavior.presentation.screens.gradedetails.mapper.BehaviorGradeDetailsMapper.buildDisplayingData.<anonymous> (BehaviorGradeDetailsMapper.kt:62)");
            }
            long jA = k70.a.f108864a.a(rVar, k70.a.f108865b).getSurface().a();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jA;
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final i.a.DisplayingGradeDetails c(h.DisplayingGradeDetails state, Params params) {
        return new i.a.DisplayingGradeDetails(f(state.getSelectedGrade().getType(), params.a()), b.f172539a[state.getSelectedGrade().getType().ordinal()] == 1 ? new o40.a.Icon(jz.a.E1, c.f172540a, d.f172541a, this.labelProvider.c(f94.a.f60365g), null, null, 32, null) : new o40.a.Icon(jz.a.F1, e.f172542a, f.f172543a, this.labelProvider.c(f94.a.f60363e), null, null, 32, null), e(state.getSelectedGrade()), params.a());
    }

    private final CardListData e(PartialBehaviourGrade grade) {
        Label labelB;
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData("behaviourGradeDetails_date", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(f94.a.f60360b), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(grade.getDate().format(DateTimeFormatter.ofPattern(fz.c.DOTTED.getFormat())), "gradeDetails_grade_date"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData("behaviourGradeDetails_author", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(f94.a.f60372n), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(grade.getAuthor(), "gradeDetails_grade_author"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        String comment = grade.getComment();
        if (comment == null || (labelB = mx.b.b(comment, "behaviourGradeDetails_comment_content")) == null) {
            labelB = Label.INSTANCE.b();
        }
        return new CardListData(v.s(defaultSingleCardData, defaultSingleCardData2, new DefaultSingleCardData("behaviourGradeDetails_comment", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(f94.a.f60371m), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(labelB, null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null)), null, false, null, null, 30, null);
    }

    private final BaseScaffoldData f(g type, er.a<i0> onBack) {
        return new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), onBack), this.labelProvider.c(b.f172539a[type.ordinal()] == 1 ? f94.a.f60366h : f94.a.f60364f), null, null, null, 28, null), null, null, null, null, 61, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public i.a b(Params params) {
        h state = params.getState();
        if (state instanceof h.c) {
            return i.a.c.f153735a;
        }
        if (state instanceof h.DisplayingGradeDetails) {
            return c((h.DisplayingGradeDetails) state, params);
        }
        if (state instanceof h.ErrorLoadingGradeDetails) {
            return new i.a.Error(((h.ErrorLoadingGradeDetails) state).getErrorVMS());
        }
        throw new oq.p();
    }
}
