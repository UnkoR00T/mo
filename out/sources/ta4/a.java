package ta4;

import ez.e;
import fr.t;
import i50.BaseScaffoldData;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.b;
import oa4.LessonDetails;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import ra4.h;
import ra4.i;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lta4/a;", "Lxw/f;", "Lta4/a$a;", "Lra4/i$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Loa4/b;", "lessonDetails", "Ln30/b;", "c", "(Loa4/b;)Ln30/b;", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Li50/a;", "e", "(Ler/a;)Li50/a;", "params", "f", "(Lta4/a$a;)Lra4/i$a;", "a", "Lmx/c;", "b", "Lez/e;", "schooltimetable_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, i.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: ta4.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lta4/a$a;", "", "Lra4/h;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "<init>", "(Lra4/h;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lra4/h;", "b", "()Lra4/h;", "Ler/a;", "()Ler/a;", "schooltimetable_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    public a(c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final CardListData c(LessonDetails lessonDetails) {
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData("lessonDetails_attendance", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(ka4.a.f109651c), null, null, 0, 0, null, 62, null), new b.Title(new SingleCardLabel(mx.b.b(lessonDetails.getAttendanceDescription(), "lessonDetails_attendance_value"), null, null, 0, 0, null, 62, null)), null), null, null, null, 2300, null);
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData("lessonDetails_date", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(ka4.a.f109649a), null, null, 0, 0, null, 62, null), new b.Title(new SingleCardLabel(mx.b.b(this.dateFormatter.d(new fz.b.LocalDate(lessonDetails.getDate()), fz.c.DOTTED), "lessonDetails_date_value"), null, null, 0, 0, null, 62, null)), null), null, null, null, 2300, null);
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData("lessonDetails_duration", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(ka4.a.f109650b), null, null, 0, 0, null, 62, null), new b.Title(new SingleCardLabel(mx.b.b(lessonDetails.getDuration(), "lessonDetails_duration_value"), null, null, 0, 0, null, 62, null)), null), null, null, null, 2300, null);
        SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(ka4.a.f109652d), null, null, 0, 0, null, 62, null);
        String classNumber = lessonDetails.getClassNumber();
        if (classNumber == null) {
            classNumber = "-";
        }
        DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData("lessonDetails_room", null, false, null, null, false, null, null, new BodySection(singleCardLabel, new b.Title(new SingleCardLabel(mx.b.b(classNumber, "lessonDetails_room_value"), null, null, 0, 0, null, 62, null)), null), null, null, null, 2300, null);
        SingleCardLabel singleCardLabel2 = new SingleCardLabel(this.labelProvider.c(ka4.a.f109659k), null, null, 0, 0, null, 62, null);
        String topic = lessonDetails.getTopic();
        if (topic == null) {
            topic = "-";
        }
        return new CardListData(v.q(defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData3, defaultSingleCardData4, new DefaultSingleCardData("lessonDetails_topic", null, false, null, null, false, null, null, new BodySection(singleCardLabel2, new b.Title(new SingleCardLabel(mx.b.b(topic, "lessonDetails_topic_value"), null, null, 0, 0, null, 62, null)), null), null, null, null, 2300, null), new DefaultSingleCardData("lessonDetails_teacher", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(ka4.a.f109657i), null, null, 0, 0, null, 62, null), new b.Title(new SingleCardLabel(mx.b.b(lessonDetails.getTeacher(), "lessonDetails_teacher_value"), null, null, 0, 0, null, 62, null)), null), null, null, null, 2300, null)), null, false, null, null, 30, null);
    }

    private final BaseScaffoldData e(er.a<i0> onBack) {
        return new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), onBack), this.labelProvider.c(ka4.a.f109654f), null, null, null, 28, null), null, null, null, null, 61, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public i.a b(Params params) {
        h state = params.getState();
        if (state instanceof h.c) {
            return i.a.c.f172784a;
        }
        if (state instanceof h.ErrorLoadingLessonDetails) {
            return new i.a.ErrorLoadingLessonDetails(((h.ErrorLoadingLessonDetails) state).getErrorVMS());
        }
        if (!(state instanceof h.DisplayingLessonDetails)) {
            throw new p();
        }
        h.DisplayingLessonDetails displayingLessonDetails = (h.DisplayingLessonDetails) state;
        return new i.a.DisplayingLessonDetails(e(params.a()), mx.b.b(displayingLessonDetails.getLessonDetails().getTitle(), "lessonDetails_title"), mx.b.b(displayingLessonDetails.getLessonDetails().getNumber() + ". " + this.labelProvider.c(ka4.a.f109653e).getText(), "lessonDetails_number"), c(displayingLessonDetails.getLessonDetails()), params.a());
    }
}
