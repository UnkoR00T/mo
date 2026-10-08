package j21;

import g21.Action;
import g21.Source;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lj21/h1;", "", "c", "e", "b", "a", "g", "d", "f", "Lj21/h1$a;", "Lj21/h1$b;", "Lj21/h1$c;", "Lj21/h1$d;", "Lj21/h1$e;", "Lj21/h1$f;", "Lj21/h1$g;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h1 {

    /* JADX INFO: renamed from: j21.h1$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lj21/h1$b;", "Lj21/h1;", "", "lastQuestion", "message", "", "showActionButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements h1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String lastQuestion;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String message;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showActionButton;

        public Error(String str, String str2, boolean z15) {
            this.lastQuestion = str;
            this.message = str2;
            this.showActionButton = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLastQuestion() {
            return this.lastQuestion;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getShowActionButton() {
            return this.showActionButton;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return fr.t.c(this.lastQuestion, error.lastQuestion) && fr.t.c(this.message, error.message) && this.showActionButton == error.showActionButton;
        }

        public int hashCode() {
            return (((this.lastQuestion.hashCode() * 31) + this.message.hashCode()) * 31) + Boolean.hashCode(this.showActionButton);
        }

        public String toString() {
            return "Error(lastQuestion=" + this.lastQuestion + ", message=" + this.message + ", showActionButton=" + this.showActionButton + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lj21/h1$c;", "Lj21/h1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c implements h1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f98759a = new c();

        private c() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return -926696755;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: j21.h1$d, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lj21/h1$d;", "Lj21/h1;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LimitExceeded implements h1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String message;

        public LimitExceeded(String str) {
            this.message = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LimitExceeded) && fr.t.c(this.message, ((LimitExceeded) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "LimitExceeded(message=" + this.message + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lj21/h1$e;", "Lj21/h1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e implements h1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f98761a = new e();

        private e() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof e);
        }

        public int hashCode() {
            return 1756579013;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: renamed from: j21.h1$f, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lj21/h1$f;", "Lj21/h1;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Question implements h1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String message;

        public Question(String str) {
            this.message = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Question) && fr.t.c(this.message, ((Question) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "Question(message=" + this.message + ')';
        }
    }

    /* JADX INFO: renamed from: j21.h1$g, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lj21/h1$g;", "Lj21/h1;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Warning implements h1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String message;

        public Warning(String str) {
            this.message = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Warning) && fr.t.c(this.message, ((Warning) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "Warning(message=" + this.message + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lj21/h1$a;", "Lj21/h1;", "b", "a", "Lj21/h1$a$a;", "Lj21/h1$a$b;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends h1 {

        /* JADX INFO: renamed from: j21.h1$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0014"}, d2 = {"Lj21/h1$a$b;", "Lj21/h1$a;", "", "content", "<init>", "(Ljava/lang/String;)V", "a", "(Ljava/lang/String;)Lj21/h1$a$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "b", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Part implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String content;

            public Part(String str) {
                this.content = str;
            }

            public final Part a(String content) {
                return new Part(content);
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getContent() {
                return this.content;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Part) && fr.t.c(this.content, ((Part) other).content);
            }

            public int hashCode() {
                return this.content.hashCode();
            }

            public String toString() {
                return "Part(content=" + this.content + ')';
            }
        }

        /* JADX INFO: renamed from: j21.h1$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J|\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b \u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b%\u0010(R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b#\u0010/\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b0\u0010.R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b-\u00101\u001a\u0004\b+\u00102¨\u00063"}, d2 = {"Lj21/h1$a$a;", "Lj21/h1$a;", "", "content", "Liy/b0;", "responseId", "", "Lg21/g;", "sources", "Lg21/a;", "actions", "suggestions", "", "showRating", "", "currentMessages", "showMessageCount", "Lg21/e;", "rating", "<init>", "(Ljava/lang/String;Liy/b0;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZIZLg21/e;)V", "a", "(Ljava/lang/String;Liy/b0;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZIZLg21/e;)Lj21/h1$a$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Liy/b0;", "g", "()Liy/b0;", "c", "Ljava/util/List;", "j", "()Ljava/util/List;", "e", "k", "f", "Z", "i", "()Z", "I", "h", "Lg21/e;", "()Lg21/e;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Full implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String content;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final iy.b0 responseId;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<Source> sources;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<Action> actions;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<String> suggestions;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean showRating;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final int currentMessages;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean showMessageCount;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final g21.e rating;

            public Full(String str, iy.b0 b0Var, List<Source> list, List<Action> list2, List<String> list3, boolean z15, int i15, boolean z16, g21.e eVar) {
                this.content = str;
                this.responseId = b0Var;
                this.sources = list;
                this.actions = list2;
                this.suggestions = list3;
                this.showRating = z15;
                this.currentMessages = i15;
                this.showMessageCount = z16;
                this.rating = eVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Full b(Full full, String str, iy.b0 b0Var, List list, List list2, List list3, boolean z15, int i15, boolean z16, g21.e eVar, int i16, Object obj) {
                if ((i16 & 1) != 0) {
                    str = full.content;
                }
                if ((i16 & 2) != 0) {
                    b0Var = full.responseId;
                }
                if ((i16 & 4) != 0) {
                    list = full.sources;
                }
                if ((i16 & 8) != 0) {
                    list2 = full.actions;
                }
                if ((i16 & 16) != 0) {
                    list3 = full.suggestions;
                }
                if ((i16 & 32) != 0) {
                    z15 = full.showRating;
                }
                if ((i16 & 64) != 0) {
                    i15 = full.currentMessages;
                }
                if ((i16 & 128) != 0) {
                    z16 = full.showMessageCount;
                }
                if ((i16 & 256) != 0) {
                    eVar = full.rating;
                }
                boolean z17 = z16;
                g21.e eVar2 = eVar;
                boolean z18 = z15;
                int i17 = i15;
                List list4 = list3;
                List list5 = list;
                return full.a(str, b0Var, list5, list2, list4, z18, i17, z17, eVar2);
            }

            public final Full a(String content, iy.b0 responseId, List<Source> sources, List<Action> actions, List<String> suggestions, boolean showRating, int currentMessages, boolean showMessageCount, g21.e rating) {
                return new Full(content, responseId, sources, actions, suggestions, showRating, currentMessages, showMessageCount, rating);
            }

            public final List<Action> c() {
                return this.actions;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getContent() {
                return this.content;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final int getCurrentMessages() {
                return this.currentMessages;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Full)) {
                    return false;
                }
                Full full = (Full) other;
                return fr.t.c(this.content, full.content) && fr.t.c(this.responseId, full.responseId) && fr.t.c(this.sources, full.sources) && fr.t.c(this.actions, full.actions) && fr.t.c(this.suggestions, full.suggestions) && this.showRating == full.showRating && this.currentMessages == full.currentMessages && this.showMessageCount == full.showMessageCount && this.rating == full.rating;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final g21.e getRating() {
                return this.rating;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final iy.b0 getResponseId() {
                return this.responseId;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final boolean getShowMessageCount() {
                return this.showMessageCount;
            }

            public int hashCode() {
                return (((((((((((((((this.content.hashCode() * 31) + this.responseId.hashCode()) * 31) + this.sources.hashCode()) * 31) + this.actions.hashCode()) * 31) + this.suggestions.hashCode()) * 31) + Boolean.hashCode(this.showRating)) * 31) + Integer.hashCode(this.currentMessages)) * 31) + Boolean.hashCode(this.showMessageCount)) * 31) + this.rating.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final boolean getShowRating() {
                return this.showRating;
            }

            public final List<Source> j() {
                return this.sources;
            }

            public final List<String> k() {
                return this.suggestions;
            }

            public String toString() {
                return "Full(content=" + this.content + ", responseId=" + this.responseId + ", sources=" + this.sources + ", actions=" + this.actions + ", suggestions=" + this.suggestions + ", showRating=" + this.showRating + ", currentMessages=" + this.currentMessages + ", showMessageCount=" + this.showMessageCount + ", rating=" + this.rating + ')';
            }

            public /* synthetic */ Full(String str, iy.b0 b0Var, List list, List list2, List list3, boolean z15, int i15, boolean z16, g21.e eVar, int i16, fr.k kVar) {
                this(str, b0Var, list, list2, list3, z15, i15, z16, (i16 & 256) != 0 ? g21.e.UNKNOWN : eVar);
            }
        }
    }
}
