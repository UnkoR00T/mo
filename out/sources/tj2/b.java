package tj2;

import fr.k;
import fr.t;
import p071kotlin.Metadata;
import r54.c;
import r74.DefaultNotificationDetailsData;
import v32.InstantPaymentNotificationDetailsData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Ltj2/b;", "Lgx/b;", "<init>", "()V", "a", "Ltj2/b$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class b implements gx.b {

    /* JADX INFO: renamed from: tj2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ltj2/b$a;", "Ltj2/b;", "Ltj2/b$a$a;", "redirection", "<init>", "(Ltj2/b$a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltj2/b$a$a;", "()Ltj2/b$a$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ToLogin extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC4973a redirection;

        /* JADX INFO: renamed from: tj2.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000e\t\n\u000b\u0006\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u000e\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Ltj2/b$a$a;", "", "", "clearProcesses", "<init>", "(Z)V", "a", "Z", "()Z", "b", "d", "e", "c", "n", "g", "k", "l", "m", "f", "h", "i", "j", "Ltj2/b$a$a$a;", "Ltj2/b$a$a$b;", "Ltj2/b$a$a$c;", "Ltj2/b$a$a$d;", "Ltj2/b$a$a$e;", "Ltj2/b$a$a$f;", "Ltj2/b$a$a$g;", "Ltj2/b$a$a$h;", "Ltj2/b$a$a$i;", "Ltj2/b$a$a$j;", "Ltj2/b$a$a$k;", "Ltj2/b$a$a$l;", "Ltj2/b$a$a$m;", "Ltj2/b$a$a$n;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class AbstractC4973a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final boolean clearProcesses;

            /* JADX INFO: renamed from: tj2.b$a$a$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ltj2/b$a$a$a;", "Ltj2/b$a$a;", "Leo2/a;", "data", "<init>", "(Leo2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Leo2/a;", "()Leo2/a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class AuthConfirmation extends AbstractC4973a {

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final eo2.a data;

                public AuthConfirmation(eo2.a aVar) {
                    super(false, 1, null);
                    this.data = aVar;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final eo2.a getData() {
                    return this.data;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof AuthConfirmation) && t.c(this.data, ((AuthConfirmation) other).data);
                }

                public int hashCode() {
                    return this.data.hashCode();
                }

                public String toString() {
                    return "AuthConfirmation(data=" + this.data + ")";
                }
            }

            /* JADX INFO: renamed from: tj2.b$a$a$b, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ltj2/b$a$a$b;", "Ltj2/b$a$a;", "", "shouldClearProcesses", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "getShouldClearProcesses", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Default extends AbstractC4973a {

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final boolean shouldClearProcesses;

                public Default() {
                    this(false, 1, null);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Default) && this.shouldClearProcesses == ((Default) other).shouldClearProcesses;
                }

                public int hashCode() {
                    return Boolean.hashCode(this.shouldClearProcesses);
                }

                public String toString() {
                    return "Default(shouldClearProcesses=" + this.shouldClearProcesses + ")";
                }

                public Default(boolean z15) {
                    super(z15, null);
                    this.shouldClearProcesses = z15;
                }

                public /* synthetic */ Default(boolean z15, int i15, k kVar) {
                    this((i15 & 1) != 0 ? false : z15);
                }
            }

            /* JADX INFO: renamed from: tj2.b$a$a$c, reason: from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ltj2/b$a$a$c;", "Ltj2/b$a$a;", "Lr74/a;", "data", "<init>", "(Lr74/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lr74/a;", "()Lr74/a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class DefaultNotificationDetails extends AbstractC4973a {

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final DefaultNotificationDetailsData data;

                public DefaultNotificationDetails(DefaultNotificationDetailsData defaultNotificationDetailsData) {
                    super(false, 1, null);
                    this.data = defaultNotificationDetailsData;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final DefaultNotificationDetailsData getData() {
                    return this.data;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof DefaultNotificationDetails) && t.c(this.data, ((DefaultNotificationDetails) other).data);
                }

                public int hashCode() {
                    return this.data.hashCode();
                }

                public String toString() {
                    return "DefaultNotificationDetails(data=" + this.data + ")";
                }
            }

            /* JADX INFO: renamed from: tj2.b$a$a$e */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ltj2/b$a$a$e;", "Ltj2/b$a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class e extends AbstractC4973a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final e f190504b = new e();

                private e() {
                    super(false, 1, null);
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof e);
                }

                public int hashCode() {
                    return -913133344;
                }

                public String toString() {
                    return "NotificationList";
                }
            }

            /* JADX INFO: renamed from: tj2.b$a$a$f */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ltj2/b$a$a$f;", "Ltj2/b$a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class f extends AbstractC4973a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final f f190505b = new f();

                private f() {
                    super(false, 1, null);
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof f);
                }

                public int hashCode() {
                    return 1885787000;
                }

                public String toString() {
                    return "ToDefenceTraining";
                }
            }

            /* JADX INFO: renamed from: tj2.b$a$a$g, reason: from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ltj2/b$a$a$g;", "Ltj2/b$a$a;", "Lv32/a;", "data", "<init>", "(Lv32/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lv32/a;", "()Lv32/a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class ToInstantPaymentsDetails extends AbstractC4973a {

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final InstantPaymentNotificationDetailsData data;

                public ToInstantPaymentsDetails(InstantPaymentNotificationDetailsData instantPaymentNotificationDetailsData) {
                    super(false, 1, null);
                    this.data = instantPaymentNotificationDetailsData;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final InstantPaymentNotificationDetailsData getData() {
                    return this.data;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ToInstantPaymentsDetails) && t.c(this.data, ((ToInstantPaymentsDetails) other).data);
                }

                public int hashCode() {
                    return this.data.hashCode();
                }

                public String toString() {
                    return "ToInstantPaymentsDetails(data=" + this.data + ")";
                }
            }

            /* JADX INFO: renamed from: tj2.b$a$a$h */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ltj2/b$a$a$h;", "Ltj2/b$a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class h extends AbstractC4973a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final h f190507b = new h();

                private h() {
                    super(false, 1, null);
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof h);
                }

                public int hashCode() {
                    return 1396686400;
                }

                public String toString() {
                    return "ToLandRegister";
                }
            }

            /* JADX INFO: renamed from: tj2.b$a$a$i */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ltj2/b$a$a$i;", "Ltj2/b$a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class i extends AbstractC4973a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final i f190508b = new i();

                private i() {
                    super(false, 1, null);
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof i);
                }

                public int hashCode() {
                    return 1321882730;
                }

                public String toString() {
                    return "ToNationalCourtRegister";
                }
            }

            /* JADX INFO: renamed from: tj2.b$a$a$j */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ltj2/b$a$a$j;", "Ltj2/b$a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class j extends AbstractC4973a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final j f190509b = new j();

                private j() {
                    super(false, 1, null);
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof j);
                }

                public int hashCode() {
                    return -71713831;
                }

                public String toString() {
                    return "ToPeselRestriction";
                }
            }

            /* JADX INFO: renamed from: tj2.b$a$a$k, reason: from toString */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Ltj2/b$a$a$k;", "Ltj2/b$a$a;", "", "token", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class ToQualifiedSignatureIdentityConfirmation extends AbstractC4973a {

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final String token;

                public ToQualifiedSignatureIdentityConfirmation(String str) {
                    super(false, 1, null);
                    this.token = str;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getToken() {
                    return this.token;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ToQualifiedSignatureIdentityConfirmation) && t.c(this.token, ((ToQualifiedSignatureIdentityConfirmation) other).token);
                }

                public int hashCode() {
                    return this.token.hashCode();
                }

                public String toString() {
                    return "ToQualifiedSignatureIdentityConfirmation(token=" + this.token + ")";
                }
            }

            /* JADX INFO: renamed from: tj2.b$a$a$l, reason: from toString */
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u0018"}, d2 = {"Ltj2/b$a$a$l;", "Ltj2/b$a$a;", "", "countryIso", "messageId", "", "messageDisplayed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "d", "Z", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class ToTravelAbroadCountryDetails extends AbstractC4973a {

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final String countryIso;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final String messageId;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                private final boolean messageDisplayed;

                public ToTravelAbroadCountryDetails(String str, String str2, boolean z15) {
                    super(false, 1, null);
                    this.countryIso = str;
                    this.messageId = str2;
                    this.messageDisplayed = z15;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getCountryIso() {
                    return this.countryIso;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final boolean getMessageDisplayed() {
                    return this.messageDisplayed;
                }

                /* JADX INFO: renamed from: d, reason: from getter */
                public final String getMessageId() {
                    return this.messageId;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ToTravelAbroadCountryDetails)) {
                        return false;
                    }
                    ToTravelAbroadCountryDetails toTravelAbroadCountryDetails = (ToTravelAbroadCountryDetails) other;
                    return t.c(this.countryIso, toTravelAbroadCountryDetails.countryIso) && t.c(this.messageId, toTravelAbroadCountryDetails.messageId) && this.messageDisplayed == toTravelAbroadCountryDetails.messageDisplayed;
                }

                public int hashCode() {
                    int iHashCode = this.countryIso.hashCode() * 31;
                    String str = this.messageId;
                    return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.messageDisplayed);
                }

                public String toString() {
                    return "ToTravelAbroadCountryDetails(countryIso=" + this.countryIso + ", messageId=" + this.messageId + ", messageDisplayed=" + this.messageDisplayed + ")";
                }
            }

            /* JADX INFO: renamed from: tj2.b$a$a$m */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ltj2/b$a$a$m;", "Ltj2/b$a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class m extends AbstractC4973a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final m f190514b = new m();

                private m() {
                    super(false, 1, null);
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof m);
                }

                public int hashCode() {
                    return 410469624;
                }

                public String toString() {
                    return "ToVehicleCollision";
                }
            }

            /* JADX INFO: renamed from: tj2.b$a$a$n, reason: from toString */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Ltj2/b$a$a$n;", "Ltj2/b$a$a;", "", "qrCode", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Verification extends AbstractC4973a {

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final String qrCode;

                public Verification(String str) {
                    super(false, 1, null);
                    this.qrCode = str;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getQrCode() {
                    return this.qrCode;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Verification) && t.c(this.qrCode, ((Verification) other).qrCode);
                }

                public int hashCode() {
                    return this.qrCode.hashCode();
                }

                public String toString() {
                    return "Verification(qrCode=" + this.qrCode + ")";
                }
            }

            public /* synthetic */ AbstractC4973a(boolean z15, k kVar) {
                this(z15);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getClearProcesses() {
                return this.clearProcesses;
            }

            private AbstractC4973a(boolean z15) {
                this.clearProcesses = z15;
            }

            /* JADX INFO: renamed from: tj2.b$a$a$d, reason: from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"Ltj2/b$a$a$d;", "Ltj2/b$a$a;", "", "shouldClearProcesses", "Lr54/c;", "localNotificationItem", "<init>", "(ZLr54/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "getShouldClearProcesses", "()Z", "c", "Lr54/c;", "()Lr54/c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class DefaultWithLocalNotificationRedirection extends AbstractC4973a {

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final boolean shouldClearProcesses;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final c localNotificationItem;

                public DefaultWithLocalNotificationRedirection(boolean z15, c cVar) {
                    super(z15, null);
                    this.shouldClearProcesses = z15;
                    this.localNotificationItem = cVar;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final c getLocalNotificationItem() {
                    return this.localNotificationItem;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof DefaultWithLocalNotificationRedirection)) {
                        return false;
                    }
                    DefaultWithLocalNotificationRedirection defaultWithLocalNotificationRedirection = (DefaultWithLocalNotificationRedirection) other;
                    return this.shouldClearProcesses == defaultWithLocalNotificationRedirection.shouldClearProcesses && t.c(this.localNotificationItem, defaultWithLocalNotificationRedirection.localNotificationItem);
                }

                public int hashCode() {
                    return (Boolean.hashCode(this.shouldClearProcesses) * 31) + this.localNotificationItem.hashCode();
                }

                public String toString() {
                    return "DefaultWithLocalNotificationRedirection(shouldClearProcesses=" + this.shouldClearProcesses + ", localNotificationItem=" + this.localNotificationItem + ")";
                }

                public /* synthetic */ DefaultWithLocalNotificationRedirection(boolean z15, c cVar, int i15, k kVar) {
                    this((i15 & 1) != 0 ? false : z15, cVar);
                }
            }

            public /* synthetic */ AbstractC4973a(boolean z15, int i15, k kVar) {
                this((i15 & 1) != 0 ? false : z15, null);
            }
        }

        public ToLogin(AbstractC4973a abstractC4973a) {
            super(null);
            this.redirection = abstractC4973a;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC4973a getRedirection() {
            return this.redirection;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ToLogin) && t.c(this.redirection, ((ToLogin) other).redirection);
        }

        public int hashCode() {
            return this.redirection.hashCode();
        }

        public String toString() {
            return "ToLogin(redirection=" + this.redirection + ")";
        }
    }

    public /* synthetic */ b(k kVar) {
        this();
    }

    private b() {
    }
}
