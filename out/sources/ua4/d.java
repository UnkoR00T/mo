package ua4;

import oa4.SchoolTimetableMessage;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lua4/d;", "", "e", "f", "a", "d", "b", "c", "Lua4/d$a;", "Lua4/d$b;", "Lua4/d$c;", "Lua4/d$d;", "Lua4/d$e;", "Lua4/d$f;", "schooltimetable_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {

    /* JADX INFO: renamed from: ua4.d$b, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, d2 = {"Lua4/d$b;", "Lua4/d;", "Lua4/e;", "context", "Lfz/b$c;", "pendingSelectedDate", "Lhb4/c;", "errorVMS", "<init>", "(Lua4/e;Lfz/b$c;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lua4/e;", "()Lua4/e;", "b", "Lfz/b$c;", "c", "()Lfz/b$c;", "Lhb4/c;", "()Lhb4/c;", "schooltimetable_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ErrorLoadingMoreTimetable implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final TimetableContext context;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz.b.LocalDate pendingSelectedDate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMS;

        public ErrorLoadingMoreTimetable(TimetableContext timetableContext, fz.b.LocalDate localDate, hb4.c cVar) {
            this.context = timetableContext;
            this.pendingSelectedDate = localDate;
            this.errorVMS = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TimetableContext getContext() {
            return this.context;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final hb4.c getErrorVMS() {
            return this.errorVMS;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final fz.b.LocalDate getPendingSelectedDate() {
            return this.pendingSelectedDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorLoadingMoreTimetable)) {
                return false;
            }
            ErrorLoadingMoreTimetable errorLoadingMoreTimetable = (ErrorLoadingMoreTimetable) other;
            return fr.t.c(this.context, errorLoadingMoreTimetable.context) && fr.t.c(this.pendingSelectedDate, errorLoadingMoreTimetable.pendingSelectedDate) && fr.t.c(this.errorVMS, errorLoadingMoreTimetable.errorVMS);
        }

        public int hashCode() {
            return (((this.context.hashCode() * 31) + this.pendingSelectedDate.hashCode()) * 31) + this.errorVMS.hashCode();
        }

        public String toString() {
            return "ErrorLoadingMoreTimetable(context=" + this.context + ", pendingSelectedDate=" + this.pendingSelectedDate + ", errorVMS=" + this.errorVMS + ')';
        }
    }

    /* JADX INFO: renamed from: ua4.d$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lua4/d$c;", "Lua4/d;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "schooltimetable_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ErrorLoadingTimetable implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMS;

        public ErrorLoadingTimetable(hb4.c cVar) {
            this.errorVMS = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final hb4.c getErrorVMS() {
            return this.errorVMS;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ErrorLoadingTimetable) && fr.t.c(this.errorVMS, ((ErrorLoadingTimetable) other).errorVMS);
        }

        public int hashCode() {
            return this.errorVMS.hashCode();
        }

        public String toString() {
            return "ErrorLoadingTimetable(errorVMS=" + this.errorVMS + ')';
        }
    }

    /* JADX INFO: renamed from: ua4.d$d, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lua4/d$d;", "Lua4/d;", "Lua4/e;", "context", "Lfz/b$c;", "pendingSelectedDate", "<init>", "(Lua4/e;Lfz/b$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lua4/e;", "()Lua4/e;", "b", "Lfz/b$c;", "()Lfz/b$c;", "schooltimetable_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoadingMoreTimetable implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final TimetableContext context;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz.b.LocalDate pendingSelectedDate;

        public LoadingMoreTimetable(TimetableContext timetableContext, fz.b.LocalDate localDate) {
            this.context = timetableContext;
            this.pendingSelectedDate = localDate;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TimetableContext getContext() {
            return this.context;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final fz.b.LocalDate getPendingSelectedDate() {
            return this.pendingSelectedDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadingMoreTimetable)) {
                return false;
            }
            LoadingMoreTimetable loadingMoreTimetable = (LoadingMoreTimetable) other;
            return fr.t.c(this.context, loadingMoreTimetable.context) && fr.t.c(this.pendingSelectedDate, loadingMoreTimetable.pendingSelectedDate);
        }

        public int hashCode() {
            return (this.context.hashCode() * 31) + this.pendingSelectedDate.hashCode();
        }

        public String toString() {
            return "LoadingMoreTimetable(context=" + this.context + ", pendingSelectedDate=" + this.pendingSelectedDate + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lua4/d$e;", "Lua4/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "schooltimetable_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f196906a = new e();

        private e() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof e);
        }

        public int hashCode() {
            return 1237793016;
        }

        public String toString() {
            return "LoadingTimetable";
        }
    }

    /* JADX INFO: renamed from: ua4.d$f, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lua4/d$f;", "Lua4/d;", "Loa4/e;", "message", "<init>", "(Loa4/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loa4/e;", "()Loa4/e;", "schooltimetable_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TimetableEmptyState implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final SchoolTimetableMessage message;

        public TimetableEmptyState(SchoolTimetableMessage schoolTimetableMessage) {
            this.message = schoolTimetableMessage;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final SchoolTimetableMessage getMessage() {
            return this.message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TimetableEmptyState) && fr.t.c(this.message, ((TimetableEmptyState) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "TimetableEmptyState(message=" + this.message + ')';
        }
    }

    /* JADX INFO: renamed from: ua4.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lua4/d$a;", "Lua4/d;", "Lua4/e;", "context", "Lfz/b$c;", "selectedDate", "Ll30/w;", "scrollTrigger", "<init>", "(Lua4/e;Lfz/b$c;Ll30/w;)V", "a", "(Lua4/e;Lfz/b$c;Ll30/w;)Lua4/d$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lua4/e;", "c", "()Lua4/e;", "b", "Lfz/b$c;", "e", "()Lfz/b$c;", "Ll30/w;", "d", "()Ll30/w;", "schooltimetable_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DisplayingTimetable implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final TimetableContext context;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz.b.LocalDate selectedDate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l30.w scrollTrigger;

        public DisplayingTimetable(TimetableContext timetableContext, fz.b.LocalDate localDate, l30.w wVar) {
            this.context = timetableContext;
            this.selectedDate = localDate;
            this.scrollTrigger = wVar;
        }

        public static /* synthetic */ DisplayingTimetable b(DisplayingTimetable displayingTimetable, TimetableContext timetableContext, fz.b.LocalDate localDate, l30.w wVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                timetableContext = displayingTimetable.context;
            }
            if ((i15 & 2) != 0) {
                localDate = displayingTimetable.selectedDate;
            }
            if ((i15 & 4) != 0) {
                wVar = displayingTimetable.scrollTrigger;
            }
            return displayingTimetable.a(timetableContext, localDate, wVar);
        }

        public final DisplayingTimetable a(TimetableContext context, fz.b.LocalDate selectedDate, l30.w scrollTrigger) {
            return new DisplayingTimetable(context, selectedDate, scrollTrigger);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TimetableContext getContext() {
            return this.context;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final l30.w getScrollTrigger() {
            return this.scrollTrigger;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final fz.b.LocalDate getSelectedDate() {
            return this.selectedDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DisplayingTimetable)) {
                return false;
            }
            DisplayingTimetable displayingTimetable = (DisplayingTimetable) other;
            return fr.t.c(this.context, displayingTimetable.context) && fr.t.c(this.selectedDate, displayingTimetable.selectedDate) && fr.t.c(this.scrollTrigger, displayingTimetable.scrollTrigger);
        }

        public int hashCode() {
            int iHashCode = ((this.context.hashCode() * 31) + this.selectedDate.hashCode()) * 31;
            l30.w wVar = this.scrollTrigger;
            return iHashCode + (wVar == null ? 0 : wVar.hashCode());
        }

        public String toString() {
            return "DisplayingTimetable(context=" + this.context + ", selectedDate=" + this.selectedDate + ", scrollTrigger=" + this.scrollTrigger + ')';
        }

        public /* synthetic */ DisplayingTimetable(TimetableContext timetableContext, fz.b.LocalDate localDate, l30.w wVar, int i15, fr.k kVar) {
            this(timetableContext, localDate, (i15 & 4) != 0 ? null : wVar);
        }
    }
}
