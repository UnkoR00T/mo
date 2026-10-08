package p01;

import fr.k;
import fr.t;
import oo0.Topic;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lp01/a;", "", "Loo0/u;", "topic", "<init>", "(Loo0/u;)V", "a", "Loo0/u;", "()Loo0/u;", "c", "b", "Lp01/a$a;", "Lp01/a$b;", "Lp01/a$c;", "apprating_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Topic topic;

    /* JADX INFO: renamed from: p01.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lp01/a$a;", "Lp01/a;", "Loo0/u;", "topic", "<init>", "(Loo0/u;)V", "b", "Loo0/u;", "getTopic", "()Loo0/u;", "a", "Lp01/a$a$a;", "Lp01/a$a$b;", "apprating_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class AbstractC3723a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Topic topic;

        /* JADX INFO: renamed from: p01.a$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lp01/a$a$a;", "Lp01/a$a;", "Loo0/u;", "topic", "<init>", "(Loo0/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Loo0/u;", "a", "()Loo0/u;", "apprating_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Other extends AbstractC3723a {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Topic topic;

            public Other(Topic topic) {
                super(topic, null);
                this.topic = topic;
            }

            @Override // p01.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public Topic getTopic() {
                return this.topic;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Other) && t.c(this.topic, ((Other) other).topic);
            }

            public int hashCode() {
                return this.topic.hashCode();
            }

            public String toString() {
                return "Other(topic=" + this.topic + ')';
            }
        }

        /* JADX INFO: renamed from: p01.a$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lp01/a$a$b;", "Lp01/a$a;", "Loo0/u;", "topic", "<init>", "(Loo0/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Loo0/u;", "a", "()Loo0/u;", "apprating_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Specific extends AbstractC3723a {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Topic topic;

            public Specific(Topic topic) {
                super(topic, null);
                this.topic = topic;
            }

            @Override // p01.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public Topic getTopic() {
                return this.topic;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Specific) && t.c(this.topic, ((Specific) other).topic);
            }

            public int hashCode() {
                return this.topic.hashCode();
            }

            public String toString() {
                return "Specific(topic=" + this.topic + ')';
            }
        }

        public /* synthetic */ AbstractC3723a(Topic topic, k kVar) {
            this(topic);
        }

        private AbstractC3723a(Topic topic) {
            super(topic, null);
            this.topic = topic;
        }
    }

    /* JADX INFO: renamed from: p01.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lp01/a$b;", "Lp01/a;", "Loo0/u;", "topic", "<init>", "(Loo0/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Loo0/u;", "a", "()Loo0/u;", "apprating_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Others extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Topic topic;

        public Others(Topic topic) {
            super(topic, null);
            this.topic = topic;
        }

        @Override // p01.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public Topic getTopic() {
            return this.topic;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Others) && t.c(this.topic, ((Others) other).topic);
        }

        public int hashCode() {
            return this.topic.hashCode();
        }

        public String toString() {
            return "Others(topic=" + this.topic + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lp01/a$c;", "Lp01/a;", "Loo0/u;", "topic", "<init>", "(Loo0/u;)V", "b", "Loo0/u;", "getTopic", "()Loo0/u;", "a", "Lp01/a$c$a;", "Lp01/a$c$b;", "apprating_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Topic topic;

        /* JADX INFO: renamed from: p01.a$c$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lp01/a$c$a;", "Lp01/a$c;", "Loo0/u;", "topic", "<init>", "(Loo0/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Loo0/u;", "a", "()Loo0/u;", "apprating_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Other extends c {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Topic topic;

            public Other(Topic topic) {
                super(topic, null);
                this.topic = topic;
            }

            @Override // p01.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public Topic getTopic() {
                return this.topic;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Other) && t.c(this.topic, ((Other) other).topic);
            }

            public int hashCode() {
                return this.topic.hashCode();
            }

            public String toString() {
                return "Other(topic=" + this.topic + ')';
            }
        }

        /* JADX INFO: renamed from: p01.a$c$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lp01/a$c$b;", "Lp01/a$c;", "Loo0/u;", "topic", "<init>", "(Loo0/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Loo0/u;", "a", "()Loo0/u;", "apprating_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Specific extends c {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Topic topic;

            public Specific(Topic topic) {
                super(topic, null);
                this.topic = topic;
            }

            @Override // p01.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public Topic getTopic() {
                return this.topic;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Specific) && t.c(this.topic, ((Specific) other).topic);
            }

            public int hashCode() {
                return this.topic.hashCode();
            }

            public String toString() {
                return "Specific(topic=" + this.topic + ')';
            }
        }

        public /* synthetic */ c(Topic topic, k kVar) {
            this(topic);
        }

        private c(Topic topic) {
            super(topic, null);
            this.topic = topic;
        }
    }

    public /* synthetic */ a(Topic topic, k kVar) {
        this(topic);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public Topic getTopic() {
        return this.topic;
    }

    private a(Topic topic) {
        this.topic = topic;
    }
}
