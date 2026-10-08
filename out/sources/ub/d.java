package ub;

import android.annotation.SuppressLint;
import android.net.NetworkRequest;
import android.net.Uri;
import dc.NetworkRequestCompat;
import java.util.LinkedHashSet;
import java.util.Set;
import p071kotlin.Metadata;
import pq.e1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0003&.*B1\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tB;\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u000bB_\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\b\u0010\u0012Bg\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\b\u0010\u0015B\u0011\b\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u0019J\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u0019J\u001a\u0010\u001e\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0097\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0017¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0014\u001a\u00020\u00138\u0000X\u0081\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010/R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010/R\u001a\u0010\r\u001a\u00020\f8GX\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u00101\u001a\u0004\b*\u00102R\u001a\u0010\u000e\u001a\u00020\f8GX\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00101\u001a\u0004\b&\u00102R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8GX\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00103\u001a\u0004\b.\u00104R\u0013\u00107\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\b0\u00106¨\u00068"}, d2 = {"Lub/d;", "", "Lub/x;", "requiredNetworkType", "", "requiresCharging", "requiresBatteryNotLow", "requiresStorageNotLow", "<init>", "(Lub/x;ZZZ)V", "requiresDeviceIdle", "(Lub/x;ZZZZ)V", "", "contentTriggerUpdateDelayMillis", "contentTriggerMaxDelayMillis", "", "Lub/d$c;", "contentUriTriggers", "(Lub/x;ZZZZJJLjava/util/Set;)V", "Ldc/o;", "requiredNetworkRequestCompat", "(Ldc/o;Lub/x;ZZZZJJLjava/util/Set;)V", "other", "(Lub/d;)V", "i", "()Z", "j", "h", "k", "g", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lub/x;", "f", "()Lub/x;", "b", "Ldc/o;", "e", "()Ldc/o;", "c", "Z", "d", "J", "()J", "Ljava/util/Set;", "()Ljava/util/Set;", "Landroid/net/NetworkRequest;", "()Landroid/net/NetworkRequest;", "requiredNetworkRequest", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f197075k = new d(null, false, false, false, 15, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x requiredNetworkType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final NetworkRequestCompat requiredNetworkRequestCompat;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean requiresCharging;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean requiresDeviceIdle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean requiresBatteryNotLow;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean requiresStorageNotLow;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final long contentTriggerUpdateDelayMillis;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final long contentTriggerMaxDelayMillis;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<c> contentUriTriggers;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0007J\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0007J\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lub/d$a;", "", "<init>", "()V", "", "requiresCharging", "d", "(Z)Lub/d$a;", "Lub/x;", "networkType", "b", "(Lub/x;)Lub/d$a;", "requiresBatteryNotLow", "c", "requiresStorageNotLow", "e", "Lub/d;", "a", "()Lub/d;", "Z", "requiresDeviceIdle", "Ldc/o;", "Ldc/o;", "requiredNetworkRequest", "Lub/x;", "requiredNetworkType", "f", "", "g", "J", "triggerContentUpdateDelay", "h", "triggerContentMaxDelay", "", "Lub/d$c;", "i", "Ljava/util/Set;", "contentUriTriggers", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean requiresCharging;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean requiresDeviceIdle;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean requiresBatteryNotLow;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean requiresStorageNotLow;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private NetworkRequestCompat requiredNetworkRequest = new NetworkRequestCompat(null, 1, null);

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private x requiredNetworkType = x.NOT_REQUIRED;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private long triggerContentUpdateDelay = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private long triggerContentMaxDelay = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private Set<c> contentUriTriggers = new LinkedHashSet();

        public final d a() {
            Set setK1 = pq.v.k1(this.contentUriTriggers);
            return new d(this.requiredNetworkRequest, this.requiredNetworkType, this.requiresCharging, this.requiresDeviceIdle, this.requiresBatteryNotLow, this.requiresStorageNotLow, this.triggerContentUpdateDelay, this.triggerContentMaxDelay, setK1);
        }

        public final a b(x networkType) {
            this.requiredNetworkType = networkType;
            this.requiredNetworkRequest = new NetworkRequestCompat(null, 1, null);
            return this;
        }

        public final a c(boolean requiresBatteryNotLow) {
            this.requiresBatteryNotLow = requiresBatteryNotLow;
            return this;
        }

        public final a d(boolean requiresCharging) {
            this.requiresCharging = requiresCharging;
            return this;
        }

        public final a e(boolean requiresStorageNotLow) {
            this.requiresStorageNotLow = requiresStorageNotLow;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lub/d$c;", "", "Landroid/net/Uri;", "uri", "", "isTriggeredForDescendants", "<init>", "(Landroid/net/Uri;Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/net/Uri;", "()Landroid/net/Uri;", "b", "Z", "()Z", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Uri uri;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isTriggeredForDescendants;

        public c(Uri uri, boolean z15) {
            this.uri = uri;
            this.isTriggeredForDescendants = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsTriggeredForDescendants() {
            return this.isTriggeredForDescendants;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!fr.t.c(c.class, other != null ? other.getClass() : null)) {
                return false;
            }
            c cVar = (c) other;
            return fr.t.c(this.uri, cVar.uri) && this.isTriggeredForDescendants == cVar.isTriggeredForDescendants;
        }

        public int hashCode() {
            return (this.uri.hashCode() * 31) + Boolean.hashCode(this.isTriggeredForDescendants);
        }
    }

    public /* synthetic */ d(x xVar, boolean z15, boolean z16, boolean z17, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? x.NOT_REQUIRED : xVar, (i15 & 2) != 0 ? false : z15, (i15 & 4) != 0 ? false : z16, (i15 & 8) != 0 ? false : z17);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getContentTriggerMaxDelayMillis() {
        return this.contentTriggerMaxDelayMillis;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getContentTriggerUpdateDelayMillis() {
        return this.contentTriggerUpdateDelayMillis;
    }

    public final Set<c> c() {
        return this.contentUriTriggers;
    }

    public final NetworkRequest d() {
        return this.requiredNetworkRequestCompat.b();
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final NetworkRequestCompat getRequiredNetworkRequestCompat() {
        return this.requiredNetworkRequestCompat;
    }

    @SuppressLint({"NewApi"})
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !fr.t.c(d.class, other.getClass())) {
            return false;
        }
        d dVar = (d) other;
        if (this.requiresCharging == dVar.requiresCharging && this.requiresDeviceIdle == dVar.requiresDeviceIdle && this.requiresBatteryNotLow == dVar.requiresBatteryNotLow && this.requiresStorageNotLow == dVar.requiresStorageNotLow && this.contentTriggerUpdateDelayMillis == dVar.contentTriggerUpdateDelayMillis && this.contentTriggerMaxDelayMillis == dVar.contentTriggerMaxDelayMillis && fr.t.c(d(), dVar.d()) && this.requiredNetworkType == dVar.requiredNetworkType) {
            return fr.t.c(this.contentUriTriggers, dVar.contentUriTriggers);
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final x getRequiredNetworkType() {
        return this.requiredNetworkType;
    }

    public final boolean g() {
        return !this.contentUriTriggers.isEmpty();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getRequiresBatteryNotLow() {
        return this.requiresBatteryNotLow;
    }

    @SuppressLint({"NewApi"})
    public int hashCode() {
        int iHashCode = ((((((((this.requiredNetworkType.hashCode() * 31) + (this.requiresCharging ? 1 : 0)) * 31) + (this.requiresDeviceIdle ? 1 : 0)) * 31) + (this.requiresBatteryNotLow ? 1 : 0)) * 31) + (this.requiresStorageNotLow ? 1 : 0)) * 31;
        long j15 = this.contentTriggerUpdateDelayMillis;
        int i15 = (iHashCode + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        long j16 = this.contentTriggerMaxDelayMillis;
        int iHashCode2 = (((i15 + ((int) (j16 ^ (j16 >>> 32)))) * 31) + this.contentUriTriggers.hashCode()) * 31;
        NetworkRequest networkRequestD = d();
        return iHashCode2 + (networkRequestD != null ? networkRequestD.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getRequiresCharging() {
        return this.requiresCharging;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getRequiresDeviceIdle() {
        return this.requiresDeviceIdle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getRequiresStorageNotLow() {
        return this.requiresStorageNotLow;
    }

    @SuppressLint({"NewApi"})
    public String toString() {
        return "Constraints{requiredNetworkType=" + this.requiredNetworkType + ", requiresCharging=" + this.requiresCharging + ", requiresDeviceIdle=" + this.requiresDeviceIdle + ", requiresBatteryNotLow=" + this.requiresBatteryNotLow + ", requiresStorageNotLow=" + this.requiresStorageNotLow + ", contentTriggerUpdateDelayMillis=" + this.contentTriggerUpdateDelayMillis + ", contentTriggerMaxDelayMillis=" + this.contentTriggerMaxDelayMillis + ", contentUriTriggers=" + this.contentUriTriggers + ", }";
    }

    @SuppressLint({"NewApi"})
    public d(x xVar, boolean z15, boolean z16, boolean z17) {
        this(xVar, z15, false, z16, z17);
    }

    public d(x xVar, boolean z15, boolean z16, boolean z17, boolean z18) {
        this(xVar, z15, z16, z17, z18, -1L, 0L, null, 192, null);
    }

    public /* synthetic */ d(x xVar, boolean z15, boolean z16, boolean z17, boolean z18, long j15, long j16, Set set, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? x.NOT_REQUIRED : xVar, (i15 & 2) != 0 ? false : z15, (i15 & 4) != 0 ? false : z16, (i15 & 8) != 0 ? false : z17, (i15 & 16) != 0 ? false : z18, (i15 & 32) != 0 ? -1L : j15, (i15 & 64) != 0 ? -1L : j16, (i15 & 128) != 0 ? e1.e() : set);
    }

    public d(x xVar, boolean z15, boolean z16, boolean z17, boolean z18, long j15, long j16, Set<c> set) {
        this.requiredNetworkRequestCompat = new NetworkRequestCompat(null, 1, null);
        this.requiredNetworkType = xVar;
        this.requiresCharging = z15;
        this.requiresDeviceIdle = z16;
        this.requiresBatteryNotLow = z17;
        this.requiresStorageNotLow = z18;
        this.contentTriggerUpdateDelayMillis = j15;
        this.contentTriggerMaxDelayMillis = j16;
        this.contentUriTriggers = set;
    }

    public d(NetworkRequestCompat networkRequestCompat, x xVar, boolean z15, boolean z16, boolean z17, boolean z18, long j15, long j16, Set<c> set) {
        this.requiredNetworkRequestCompat = networkRequestCompat;
        this.requiredNetworkType = xVar;
        this.requiresCharging = z15;
        this.requiresDeviceIdle = z16;
        this.requiresBatteryNotLow = z17;
        this.requiresStorageNotLow = z18;
        this.contentTriggerUpdateDelayMillis = j15;
        this.contentTriggerMaxDelayMillis = j16;
        this.contentUriTriggers = set;
    }

    @SuppressLint({"NewApi"})
    public d(d dVar) {
        this.requiresCharging = dVar.requiresCharging;
        this.requiresDeviceIdle = dVar.requiresDeviceIdle;
        this.requiredNetworkRequestCompat = dVar.requiredNetworkRequestCompat;
        this.requiredNetworkType = dVar.requiredNetworkType;
        this.requiresBatteryNotLow = dVar.requiresBatteryNotLow;
        this.requiresStorageNotLow = dVar.requiresStorageNotLow;
        this.contentUriTriggers = dVar.contentUriTriggers;
        this.contentTriggerUpdateDelayMillis = dVar.contentTriggerUpdateDelayMillis;
        this.contentTriggerMaxDelayMillis = dVar.contentTriggerMaxDelayMillis;
    }
}
