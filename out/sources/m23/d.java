package m23;

import fr.t;
import mx.Label;
import oq.p;
import p071kotlin.Metadata;
import u70.l0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\t*\u0007\u0013\u0017\u001b\u001f\"&*\b\u0007\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0011\u000fB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Lm23/d;", "Lgz/b;", "Lm23/d$b;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lez/a;", "currentTimeProvider", "Lhz/h;", "validatorText", "<init>", "(Lmx/c;Lez/a;Lhz/h;)V", "params", "f", "(Lm23/d$b;Ltq/e;)Ljava/lang/Object;", "a", "Lmx/c;", "b", "Lez/a;", "m23/d$c", "c", "Lm23/d$c;", "dateAnswerRule", "m23/d$e", "d", "Lm23/d$e;", "dateRule", "m23/d$g", "e", "Lm23/d$g;", "timeEmptyRule", "m23/d$h", "Lm23/d$h;", "timeExceededRule", "m23/d$i", "g", "Lm23/d$i;", "timeValidator", "m23/d$f", "h", "Lm23/d$f;", "dateValidator", "m23/d$d", "i", "Lm23/d$d;", "dateAnswerValidator", "j", "Lhz/h;", "descriptionValidator", "k", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements gz.b<b, hz.g> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f123378l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c dateAnswerRule;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e dateRule;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final g timeEmptyRule;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final h timeExceededRule;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i timeValidator;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final f dateValidator;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final C3014d dateAnswerValidator;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final hz.h descriptionValidator;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lm23/d$b;", "Lgz/b$a;", "c", "a", "b", "d", "Lm23/d$b$a;", "Lm23/d$b$b;", "Lm23/d$b$c;", "Lm23/d$b$d;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b extends gz.b.a {

        /* JADX INFO: renamed from: m23.d$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lm23/d$b$a;", "Lm23/d$b;", "Lk23/f;", "answer", "<init>", "(Lk23/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk23/f;", "()Lk23/f;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Answer implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final k23.f answer;

            public Answer(k23.f fVar) {
                this.answer = fVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final k23.f getAnswer() {
                return this.answer;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Answer) && this.answer == ((Answer) other).answer;
            }

            public int hashCode() {
                k23.f fVar = this.answer;
                if (fVar == null) {
                    return 0;
                }
                return fVar.hashCode();
            }

            public String toString() {
                return "Answer(answer=" + this.answer + ')';
            }
        }

        /* JADX INFO: renamed from: m23.d$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lm23/d$b$b;", "Lm23/d$b;", "Lk23/f;", "answer", "Lfz/b$c;", "date", "<init>", "(Lk23/f;Lfz/b$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk23/f;", "()Lk23/f;", "b", "Lfz/b$c;", "()Lfz/b$c;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Date implements b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f123390c = fz.b.LocalDate.f68860b;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final k23.f answer;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final fz.b.LocalDate date;

            public Date(k23.f fVar, fz.b.LocalDate localDate) {
                this.answer = fVar;
                this.date = localDate;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final k23.f getAnswer() {
                return this.answer;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final fz.b.LocalDate getDate() {
                return this.date;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Date)) {
                    return false;
                }
                Date date = (Date) other;
                return this.answer == date.answer && t.c(this.date, date.date);
            }

            public int hashCode() {
                k23.f fVar = this.answer;
                int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
                fz.b.LocalDate localDate = this.date;
                return iHashCode + (localDate != null ? localDate.hashCode() : 0);
            }

            public String toString() {
                return "Date(answer=" + this.answer + ", date=" + this.date + ')';
            }
        }

        /* JADX INFO: renamed from: m23.d$b$c, reason: from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lm23/d$b$c;", "Lm23/d$b;", "", "text", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getText", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Description implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String text;

            public Description(String str) {
                this.text = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Description) && t.c(this.text, ((Description) other).text);
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            public String toString() {
                return "Description(text=" + this.text + ')';
            }
        }

        /* JADX INFO: renamed from: m23.d$b$d, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lm23/d$b$d;", "Lm23/d$b;", "Lk23/f;", "answer", "Lfz/b$c;", "date", "Lfz/b$g;", "time", "<init>", "(Lk23/f;Lfz/b$c;Lfz/b$g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk23/f;", "()Lk23/f;", "b", "Lfz/b$c;", "()Lfz/b$c;", "c", "Lfz/b$g;", "()Lfz/b$g;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Time implements b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f123394d = fz.b.OffsetTime.f68867b | fz.b.LocalDate.f68860b;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final k23.f answer;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final fz.b.LocalDate date;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final fz.b.OffsetTime time;

            public Time(k23.f fVar, fz.b.LocalDate localDate, fz.b.OffsetTime offsetTime) {
                this.answer = fVar;
                this.date = localDate;
                this.time = offsetTime;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final k23.f getAnswer() {
                return this.answer;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final fz.b.LocalDate getDate() {
                return this.date;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final fz.b.OffsetTime getTime() {
                return this.time;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Time)) {
                    return false;
                }
                Time time = (Time) other;
                return this.answer == time.answer && t.c(this.date, time.date) && t.c(this.time, time.time);
            }

            public int hashCode() {
                k23.f fVar = this.answer;
                int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
                fz.b.LocalDate localDate = this.date;
                int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
                fz.b.OffsetTime offsetTime = this.time;
                return iHashCode2 + (offsetTime != null ? offsetTime.hashCode() : 0);
            }

            public String toString() {
                return "Time(answer=" + this.answer + ", date=" + this.date + ", time=" + this.time + ')';
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"m23/d$c", "Lhz/a;", "Lk23/f;", "value", "", "c", "(Lk23/f;)Z", "Lmx/a;", "a", "()Lmx/a;", "errorMessage", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements hz.a<k23.f> {
        c() {
        }

        @Override // hz.a
        /* JADX INFO: renamed from: a */
        public Label getErrorMessage() {
            return d.this.labelProvider.c(h23.b.f80142h);
        }

        @Override // hz.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean b(k23.f value) {
            return value != null;
        }
    }

    /* JADX INFO: renamed from: m23.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"m23/d$d", "Lu70/b;", "Lk23/f;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C3014d extends u70.b<k23.f> {
        C3014d() {
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"m23/d$e", "Lhz/a;", "Lm23/d$b$b;", "value", "", "c", "(Lm23/d$b$b;)Z", "Lmx/a;", "a", "()Lmx/a;", "errorMessage", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements hz.a<b.Date> {
        e() {
        }

        @Override // hz.a
        /* JADX INFO: renamed from: a */
        public Label getErrorMessage() {
            return d.this.labelProvider.c(h23.b.Q);
        }

        @Override // hz.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean b(b.Date value) {
            return value.getAnswer() == null || value.getAnswer() == k23.f.NO || value.getDate() != null;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"m23/d$f", "Lu70/b;", "Lm23/d$b$b;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f extends u70.b<b.Date> {
        f() {
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"m23/d$g", "Lhz/a;", "Lm23/d$b$d;", "value", "", "c", "(Lm23/d$b$d;)Z", "Lmx/a;", "a", "()Lmx/a;", "errorMessage", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class g implements hz.a<b.Time> {
        g() {
        }

        @Override // hz.a
        /* JADX INFO: renamed from: a */
        public Label getErrorMessage() {
            return d.this.labelProvider.c(h23.b.f80122a0);
        }

        @Override // hz.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean b(b.Time value) {
            return value.getAnswer() == null || value.getAnswer() == k23.f.NO || value.getTime() != null;
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"m23/d$h", "Lhz/a;", "Lm23/d$b$d;", "value", "", "c", "(Lm23/d$b$d;)Z", "Lmx/a;", "a", "()Lmx/a;", "errorMessage", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class h implements hz.a<b.Time> {
        h() {
        }

        @Override // hz.a
        /* JADX INFO: renamed from: a */
        public Label getErrorMessage() {
            return d.this.labelProvider.c(h23.b.Y);
        }

        @Override // hz.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean b(b.Time value) {
            return value.getAnswer() == null || value.getAnswer() == k23.f.NO || value.getDate() == null || value.getTime() == null || d.this.currentTimeProvider.f().compareTo(value.getDate().getDate().atTime(value.getTime().getDate())) >= 0;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"m23/d$i", "Lu70/b;", "Lm23/d$b$d;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class i extends u70.b<b.Time> {
        i() {
        }
    }

    public d(mx.c cVar, ez.a aVar, hz.h hVar) {
        this.labelProvider = cVar;
        this.currentTimeProvider = aVar;
        c cVar2 = new c();
        this.dateAnswerRule = cVar2;
        e eVar = new e();
        this.dateRule = eVar;
        g gVar = new g();
        this.timeEmptyRule = gVar;
        h hVar2 = new h();
        this.timeExceededRule = hVar2;
        hz.c.Companion companion = hz.c.INSTANCE;
        this.timeValidator = (i) companion.a(companion.a(new i(), gVar), hVar2);
        this.dateValidator = (f) companion.a(new f(), eVar);
        this.dateAnswerValidator = (C3014d) companion.a(new C3014d(), cVar2);
        this.descriptionValidator = (hz.h) companion.a(hVar.M(cVar.c(h23.b.f80191x0)).y(500, cVar.e(h23.b.Z, 500)), new l0(cVar.e(h23.b.f80143h0, ".,?!-:;()„\""), l23.a.a()));
    }

    public Object f(b bVar, tq.e<? super hz.g> eVar) {
        if (bVar instanceof b.Description) {
            return this.descriptionValidator.a(((b.Description) bVar).getText());
        }
        if (bVar instanceof b.Answer) {
            return this.dateAnswerValidator.a(((b.Answer) bVar).getAnswer());
        }
        if (bVar instanceof b.Date) {
            return this.dateValidator.a(bVar);
        }
        if (bVar instanceof b.Time) {
            return this.timeValidator.a(bVar);
        }
        throw new p();
    }
}
