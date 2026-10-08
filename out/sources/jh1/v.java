package jh1;

import fr0.DocumentConfig;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\n\u0006\u000bB\u0013\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Ljh1/v;", "", "Ljh1/t$v;", "pendingLocalNotificationAction", "<init>", "(Ljh1/t$v;)V", "a", "Ljh1/t$v;", "getPendingLocalNotificationAction", "()Ljh1/t$v;", "b", "c", "Ljh1/v$a;", "Ljh1/v$b;", "Ljh1/v$c;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t.RedirectToDocumentFromLocalNotification pendingLocalNotificationAction;

    /* JADX INFO: renamed from: jh1.v$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Ljh1/v$a;", "Ljh1/v;", "Ljh1/t$v;", "pendingLocalNotificationAction", "<init>", "(Ljh1/t$v;)V", "a", "(Ljh1/t$v;)Ljh1/v$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljh1/t$v;", "()Ljh1/t$v;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Empty extends v {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final t.RedirectToDocumentFromLocalNotification pendingLocalNotificationAction;

        public Empty(t.RedirectToDocumentFromLocalNotification redirectToDocumentFromLocalNotification) {
            super(redirectToDocumentFromLocalNotification, null);
            this.pendingLocalNotificationAction = redirectToDocumentFromLocalNotification;
        }

        public final Empty a(t.RedirectToDocumentFromLocalNotification pendingLocalNotificationAction) {
            return new Empty(pendingLocalNotificationAction);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public t.RedirectToDocumentFromLocalNotification getPendingLocalNotificationAction() {
            return this.pendingLocalNotificationAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Empty) && fr.t.c(this.pendingLocalNotificationAction, ((Empty) other).pendingLocalNotificationAction);
        }

        public int hashCode() {
            t.RedirectToDocumentFromLocalNotification redirectToDocumentFromLocalNotification = this.pendingLocalNotificationAction;
            if (redirectToDocumentFromLocalNotification == null) {
                return 0;
            }
            return redirectToDocumentFromLocalNotification.hashCode();
        }

        public String toString() {
            return "Empty(pendingLocalNotificationAction=" + this.pendingLocalNotificationAction + ')';
        }
    }

    /* JADX INFO: renamed from: jh1.v$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Ljh1/v$b;", "Ljh1/v;", "Ljh1/t$v;", "pendingLocalNotificationAction", "<init>", "(Ljh1/t$v;)V", "a", "(Ljh1/t$v;)Ljh1/v$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljh1/t$v;", "()Ljh1/t$v;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initial extends v {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final t.RedirectToDocumentFromLocalNotification pendingLocalNotificationAction;

        public Initial(t.RedirectToDocumentFromLocalNotification redirectToDocumentFromLocalNotification) {
            super(redirectToDocumentFromLocalNotification, null);
            this.pendingLocalNotificationAction = redirectToDocumentFromLocalNotification;
        }

        public final Initial a(t.RedirectToDocumentFromLocalNotification pendingLocalNotificationAction) {
            return new Initial(pendingLocalNotificationAction);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public t.RedirectToDocumentFromLocalNotification getPendingLocalNotificationAction() {
            return this.pendingLocalNotificationAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Initial) && fr.t.c(this.pendingLocalNotificationAction, ((Initial) other).pendingLocalNotificationAction);
        }

        public int hashCode() {
            t.RedirectToDocumentFromLocalNotification redirectToDocumentFromLocalNotification = this.pendingLocalNotificationAction;
            if (redirectToDocumentFromLocalNotification == null) {
                return 0;
            }
            return redirectToDocumentFromLocalNotification.hashCode();
        }

        public String toString() {
            return "Initial(pendingLocalNotificationAction=" + this.pendingLocalNotificationAction + ')';
        }
    }

    /* JADX INFO: renamed from: jh1.v$c, reason: from toString */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ¨\u0001\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b)\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b-\u00103\u001a\u0004\b6\u00105R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b0\u00103\u001a\u0004\b7\u00105R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b8\u00105R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u00078\u0006¢\u0006\f\n\u0004\b8\u0010/\u001a\u0004\b2\u00101R\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b9\u00103\u001a\u0004\b:\u00105R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b+\u0010<R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b=\u0010?R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010@\u001a\u0004\b9\u0010A¨\u0006B"}, d2 = {"Ljh1/v$c;", "Ljh1/v;", "", "Lk34/g;", "documents", "Lah1/b;", "documentsLayoutType", "", "Lrq0/b;", "Llz3/h;", "documentsStatuses", "", "isChatBotEnabled", "isElectronicDeliveryEnabled", "hasAnyNotDisplayedPush", "layoutChanged", "Lfr0/g;", "documentsConfig", "shouldPlayEnterAnimation", "Llh1/a;", "bigCardsState", "Lah1/i;", "studentCardExpirationAlert", "Ljh1/t$v;", "pendingLocalNotificationAction", "<init>", "(Ljava/util/List;Lah1/b;Ljava/util/Map;ZZZZLjava/util/Map;ZLlh1/a;Lah1/i;Ljh1/t$v;)V", "a", "(Ljava/util/List;Lah1/b;Ljava/util/Map;ZZZZLjava/util/Map;ZLlh1/a;Lah1/i;Ljh1/t$v;)Ljh1/v$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "Lah1/b;", "f", "()Lah1/b;", "Ljava/util/Map;", "g", "()Ljava/util/Map;", "e", "Z", "m", "()Z", "n", "h", "i", "j", "k", "Llh1/a;", "()Llh1/a;", "l", "Lah1/i;", "()Lah1/i;", "Ljh1/t$v;", "()Ljh1/t$v;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized extends v {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<k34.g> documents;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ah1.b documentsLayoutType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<rq0.b, lz3.h> documentsStatuses;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isChatBotEnabled;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isElectronicDeliveryEnabled;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasAnyNotDisplayedPush;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean layoutChanged;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<rq0.b, DocumentConfig> documentsConfig;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldPlayEnterAnimation;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final lh1.a bigCardsState;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final ah1.i studentCardExpirationAlert;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final t.RedirectToDocumentFromLocalNotification pendingLocalNotificationAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Initialized(List<? extends k34.g> list, ah1.b bVar, Map<rq0.b, ? extends lz3.h> map, boolean z15, boolean z16, boolean z17, boolean z18, Map<rq0.b, DocumentConfig> map2, boolean z19, lh1.a aVar, ah1.i iVar, t.RedirectToDocumentFromLocalNotification redirectToDocumentFromLocalNotification) {
            super(redirectToDocumentFromLocalNotification, null);
            this.documents = list;
            this.documentsLayoutType = bVar;
            this.documentsStatuses = map;
            this.isChatBotEnabled = z15;
            this.isElectronicDeliveryEnabled = z16;
            this.hasAnyNotDisplayedPush = z17;
            this.layoutChanged = z18;
            this.documentsConfig = map2;
            this.shouldPlayEnterAnimation = z19;
            this.bigCardsState = aVar;
            this.studentCardExpirationAlert = iVar;
            this.pendingLocalNotificationAction = redirectToDocumentFromLocalNotification;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initialized b(Initialized initialized, List list, ah1.b bVar, Map map, boolean z15, boolean z16, boolean z17, boolean z18, Map map2, boolean z19, lh1.a aVar, ah1.i iVar, t.RedirectToDocumentFromLocalNotification redirectToDocumentFromLocalNotification, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                list = initialized.documents;
            }
            if ((i15 & 2) != 0) {
                bVar = initialized.documentsLayoutType;
            }
            if ((i15 & 4) != 0) {
                map = initialized.documentsStatuses;
            }
            if ((i15 & 8) != 0) {
                z15 = initialized.isChatBotEnabled;
            }
            if ((i15 & 16) != 0) {
                z16 = initialized.isElectronicDeliveryEnabled;
            }
            if ((i15 & 32) != 0) {
                z17 = initialized.hasAnyNotDisplayedPush;
            }
            if ((i15 & 64) != 0) {
                z18 = initialized.layoutChanged;
            }
            if ((i15 & 128) != 0) {
                map2 = initialized.documentsConfig;
            }
            if ((i15 & 256) != 0) {
                z19 = initialized.shouldPlayEnterAnimation;
            }
            if ((i15 & 512) != 0) {
                aVar = initialized.bigCardsState;
            }
            if ((i15 & 1024) != 0) {
                iVar = initialized.studentCardExpirationAlert;
            }
            if ((i15 & 2048) != 0) {
                redirectToDocumentFromLocalNotification = initialized.pendingLocalNotificationAction;
            }
            ah1.i iVar2 = iVar;
            t.RedirectToDocumentFromLocalNotification redirectToDocumentFromLocalNotification2 = redirectToDocumentFromLocalNotification;
            boolean z25 = z19;
            lh1.a aVar2 = aVar;
            boolean z26 = z18;
            Map map3 = map2;
            boolean z27 = z16;
            boolean z28 = z17;
            return initialized.a(list, bVar, map, z15, z27, z28, z26, map3, z25, aVar2, iVar2, redirectToDocumentFromLocalNotification2);
        }

        public final Initialized a(List<? extends k34.g> documents, ah1.b documentsLayoutType, Map<rq0.b, ? extends lz3.h> documentsStatuses, boolean isChatBotEnabled, boolean isElectronicDeliveryEnabled, boolean hasAnyNotDisplayedPush, boolean layoutChanged, Map<rq0.b, DocumentConfig> documentsConfig, boolean shouldPlayEnterAnimation, lh1.a bigCardsState, ah1.i studentCardExpirationAlert, t.RedirectToDocumentFromLocalNotification pendingLocalNotificationAction) {
            return new Initialized(documents, documentsLayoutType, documentsStatuses, isChatBotEnabled, isElectronicDeliveryEnabled, hasAnyNotDisplayedPush, layoutChanged, documentsConfig, shouldPlayEnterAnimation, bigCardsState, studentCardExpirationAlert, pendingLocalNotificationAction);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final lh1.a getBigCardsState() {
            return this.bigCardsState;
        }

        public final List<k34.g> d() {
            return this.documents;
        }

        public final Map<rq0.b, DocumentConfig> e() {
            return this.documentsConfig;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.documents, initialized.documents) && this.documentsLayoutType == initialized.documentsLayoutType && fr.t.c(this.documentsStatuses, initialized.documentsStatuses) && this.isChatBotEnabled == initialized.isChatBotEnabled && this.isElectronicDeliveryEnabled == initialized.isElectronicDeliveryEnabled && this.hasAnyNotDisplayedPush == initialized.hasAnyNotDisplayedPush && this.layoutChanged == initialized.layoutChanged && fr.t.c(this.documentsConfig, initialized.documentsConfig) && this.shouldPlayEnterAnimation == initialized.shouldPlayEnterAnimation && this.bigCardsState == initialized.bigCardsState && fr.t.c(this.studentCardExpirationAlert, initialized.studentCardExpirationAlert) && fr.t.c(this.pendingLocalNotificationAction, initialized.pendingLocalNotificationAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final ah1.b getDocumentsLayoutType() {
            return this.documentsLayoutType;
        }

        public final Map<rq0.b, lz3.h> g() {
            return this.documentsStatuses;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getHasAnyNotDisplayedPush() {
            return this.hasAnyNotDisplayedPush;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((((this.documents.hashCode() * 31) + this.documentsLayoutType.hashCode()) * 31) + this.documentsStatuses.hashCode()) * 31) + Boolean.hashCode(this.isChatBotEnabled)) * 31) + Boolean.hashCode(this.isElectronicDeliveryEnabled)) * 31) + Boolean.hashCode(this.hasAnyNotDisplayedPush)) * 31) + Boolean.hashCode(this.layoutChanged)) * 31) + this.documentsConfig.hashCode()) * 31) + Boolean.hashCode(this.shouldPlayEnterAnimation)) * 31) + this.bigCardsState.hashCode()) * 31) + this.studentCardExpirationAlert.hashCode()) * 31;
            t.RedirectToDocumentFromLocalNotification redirectToDocumentFromLocalNotification = this.pendingLocalNotificationAction;
            return iHashCode + (redirectToDocumentFromLocalNotification == null ? 0 : redirectToDocumentFromLocalNotification.hashCode());
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getLayoutChanged() {
            return this.layoutChanged;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public t.RedirectToDocumentFromLocalNotification getPendingLocalNotificationAction() {
            return this.pendingLocalNotificationAction;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getShouldPlayEnterAnimation() {
            return this.shouldPlayEnterAnimation;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final ah1.i getStudentCardExpirationAlert() {
            return this.studentCardExpirationAlert;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final boolean getIsChatBotEnabled() {
            return this.isChatBotEnabled;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final boolean getIsElectronicDeliveryEnabled() {
            return this.isElectronicDeliveryEnabled;
        }

        public String toString() {
            return "Initialized(documents=" + this.documents + ", documentsLayoutType=" + this.documentsLayoutType + ", documentsStatuses=" + this.documentsStatuses + ", isChatBotEnabled=" + this.isChatBotEnabled + ", isElectronicDeliveryEnabled=" + this.isElectronicDeliveryEnabled + ", hasAnyNotDisplayedPush=" + this.hasAnyNotDisplayedPush + ", layoutChanged=" + this.layoutChanged + ", documentsConfig=" + this.documentsConfig + ", shouldPlayEnterAnimation=" + this.shouldPlayEnterAnimation + ", bigCardsState=" + this.bigCardsState + ", studentCardExpirationAlert=" + this.studentCardExpirationAlert + ", pendingLocalNotificationAction=" + this.pendingLocalNotificationAction + ')';
        }
    }

    public /* synthetic */ v(t.RedirectToDocumentFromLocalNotification redirectToDocumentFromLocalNotification, fr.k kVar) {
        this(redirectToDocumentFromLocalNotification);
    }

    private v(t.RedirectToDocumentFromLocalNotification redirectToDocumentFromLocalNotification) {
        this.pendingLocalNotificationAction = redirectToDocumentFromLocalNotification;
    }
}
