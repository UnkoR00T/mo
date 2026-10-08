package ga4;

import ea4.i;
import ea4.j;
import er.l;
import ez.e;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import k40.EmptyStateData;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import w94.GradePreview;
import w94.SemesterGrade;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001!B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0018\u001a\u00020\u00172\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00150\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lga4/c;", "Lxw/f;", "Lga4/c$a;", "Lea4/j$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lea4/i$a;", "state", "params", "Lea4/j$a$a;", "f", "(Lea4/i$a;Lga4/c$a;)Lea4/j$a$a;", "", "Lw94/d;", "grades", "Lkotlin/Function1;", "", "Loq/i0;", "onGradeClicked", "Ln30/b;", "h", "(Ljava/util/List;Ler/l;)Ln30/b;", "Lw94/i;", "semesterGrade", "onSemesterGradeClicked", "l", "(Lw94/i;Ler/l;)Ln30/b;", "q", "(Lga4/c$a;)Lea4/j$a;", "a", "Lmx/c;", "b", "Lez/e;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, j.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: ga4.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010 R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lga4/c$a;", "", "Lea4/i;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lkotlin/Function1;", "", "onGradeClicked", "Lw94/i;", "onSemesterGradeClicked", "<init>", "(Lea4/i;Ler/a;Ler/l;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lea4/i;", "d", "()Lea4/i;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final i state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onGradeClicked;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<SemesterGrade, i0> onSemesterGradeClicked;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(i iVar, er.a<i0> aVar, l<? super String, i0> lVar, l<? super SemesterGrade, i0> lVar2) {
            this.state = iVar;
            this.onBack = aVar;
            this.onGradeClicked = lVar;
            this.onSemesterGradeClicked = lVar2;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final l<String, i0> b() {
            return this.onGradeClicked;
        }

        public final l<SemesterGrade, i0> c() {
            return this.onSemesterGradeClicked;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final i getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onGradeClicked, params.onGradeClicked) && t.c(this.onSemesterGradeClicked, params.onSemesterGradeClicked);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onGradeClicked.hashCode()) * 31) + this.onSemesterGradeClicked.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onGradeClicked=" + this.onGradeClicked + ", onSemesterGradeClicked=" + this.onSemesterGradeClicked + ')';
        }
    }

    public c(mx.c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final j.a.DisplayingSubjectGrades f(i.DisplayingSubjectGrades state, Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(s94.a.f179505m), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelB = mx.b.b(state.getSubjectTitle(), "subjectGrades_subjectTitle");
        Label labelC = this.labelProvider.c(s94.a.f179498f);
        CardListData cardListDataH = h(state.getSubjectGrades().a(), params.b());
        SemesterGrade semesterGrade = state.getSubjectGrades().getSemesterGrade();
        CardListData cardListDataL = semesterGrade != null ? l(semesterGrade, params.c()) : null;
        EmptyStateData emptyStateData = new EmptyStateData(null, this.labelProvider.c(s94.a.f179504l), null, 4, null);
        if (!state.getSubjectGrades().a().isEmpty()) {
            emptyStateData = null;
        }
        return new j.a.DisplayingSubjectGrades(baseScaffoldData, labelB, labelC, cardListDataH, cardListDataL, emptyStateData, params.a());
    }

    private final CardListData h(List<GradePreview> grades, final l<? super String, i0> onGradeClicked) {
        List<GradePreview> list = grades;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        for (final GradePreview gradePreview : list) {
            String str = "gradeItem_" + gradePreview.getId();
            Integer numA = z94.a.a(gradePreview.getIcon());
            LeadingSection leadingSection = numA != null ? new LeadingSection(false, null, new n50.i.Resource(new n50.i.Resource.a.DrawableResource(numA.intValue(), null, 2, null), null, null, 6, null), 3, null) : null;
            arrayList.add(new DefaultSingleCardData(str, new er.a() { // from class: ga4.a
                @Override // er.a
                public final Object a() {
                    return c.i(onGradeClicked, gradePreview);
                }
            }, false, null, null, false, null, null, new BodySection(new SingleCardLabel(mx.b.b(this.dateFormatter.c(gradePreview.getCreatedAt()), "grade_date_" + gradePreview.getId()), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(gradePreview.getGrade(), "grade_value_" + gradePreview.getId()), null, null, 2, 0, null, 54, null)), new SingleCardLabel(mx.b.b(gradePreview.getCategory(), "grade_category_" + gradePreview.getId()), null, null, 0, 0, null, 62, null)), leadingSection, x0.Icon.INSTANCE.b(), null, 2300, null));
        }
        return new CardListData(arrayList, null, false, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(l lVar, GradePreview gradePreview) {
        lVar.b(gradePreview.getId());
        return i0.f148189a;
    }

    private final CardListData l(final SemesterGrade semesterGrade, final l<? super SemesterGrade, i0> onSemesterGradeClicked) {
        Integer numA = z94.a.a(semesterGrade.getIcon());
        return new CardListData(v.e(new DefaultSingleCardData("semesterGradeItem", new er.a() { // from class: ga4.b
            @Override // er.a
            public final Object a() {
                return c.m(onSemesterGradeClicked, semesterGrade);
            }
        }, false, null, null, false, null, null, new BodySection(new SingleCardLabel(mx.b.b(this.dateFormatter.c(semesterGrade.getCreatedAt()), "semesterGrade_date"), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(semesterGrade.getGrade(), "semesterGrade_value"), null, null, 2, 0, null, 54, null)), new SingleCardLabel(mx.b.b(semesterGrade.getCategory(), "semesterGrade_category"), null, null, 0, 0, null, 62, null)), numA != null ? new LeadingSection(false, null, new n50.i.Resource(new n50.i.Resource.a.DrawableResource(numA.intValue(), null, 2, null), null, null, 6, null), 3, null) : null, x0.Icon.INSTANCE.b(), null, 2300, null)), null, false, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(l lVar, SemesterGrade semesterGrade) {
        lVar.b(semesterGrade);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public j.a b(Params params) {
        i state = params.getState();
        if (state instanceof i.c) {
            return j.a.c.f49022a;
        }
        if (state instanceof i.DisplayingSubjectGrades) {
            return f((i.DisplayingSubjectGrades) state, params);
        }
        if (state instanceof i.ErrorLoadingSubjectGrades) {
            return new j.a.ErrorLoadingSubjectGrades(((i.ErrorLoadingSubjectGrades) state).getErrorVMS());
        }
        throw new p();
    }
}
