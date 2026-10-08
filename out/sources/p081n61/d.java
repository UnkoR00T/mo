package p081n61;

import g81.DocumentPickerNavigationParams;
import java.util.Iterator;
import o61.SetupData;
import p071kotlin.Metadata;
import y61.ChildPassportApplicationAttachmentsNavigationParams;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00062\u00020\u0001:.\u0007\b\t\n\u000b\f\r\u0003\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0\u000612R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001-3456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_¨\u0006`À\u0006\u0003"}, d2 = {"Ln61/d;", "Lzx/a;", "", "g", "()Z", "isBackupNavigation", "g0", "c0", "f", "e0", "l0", "s0", "h", "u", "e", "d", "p0", "r", "v", "t0", "s", "q", "a", "h0", "a0", "z", "p", "m", "n", "r0", "b", "x", "m0", "n0", "b0", "j0", "j", "c", "y", "f0", "l", "k", "k0", "o0", "o", "i0", "t", "w", "d0", "q0", "i", "Ln61/d$a;", "Ln61/d$b;", "Ln61/d$c;", "Ln61/d$d;", "Ln61/d$e;", "Ln61/d$f;", "Ln61/d$g;", "Ln61/d$h;", "Ln61/d$j;", "Ln61/d$k;", "Ln61/d$l;", "Ln61/d$m;", "Ln61/d$n;", "Ln61/d$o;", "Ln61/d$p;", "Ln61/d$q;", "Ln61/d$r;", "Ln61/d$s;", "Ln61/d$t;", "Ln61/d$u;", "Ln61/d$v;", "Ln61/d$w;", "Ln61/d$x;", "Ln61/d$y;", "Ln61/d$z;", "Ln61/d$a0;", "Ln61/d$b0;", "Ln61/d$c0;", "Ln61/d$d0;", "Ln61/d$e0;", "Ln61/d$f0;", "Ln61/d$g0;", "Ln61/d$h0;", "Ln61/d$i0;", "Ln61/d$j0;", "Ln61/d$k0;", "Ln61/d$l0;", "Ln61/d$m0;", "Ln61/d$n0;", "Ln61/d$o0;", "Ln61/d$p0;", "Ln61/d$q0;", "Ln61/d$r0;", "Ln61/d$s0;", "Ln61/d$t0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends zx.a {

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f132588a;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$a;", "Ln61/d;", "Lzx/c;", "Lo61/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements d, zx.c<SetupData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f132513a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/addphoto";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = true;

        private a() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return -61473396;
        }

        public String toString() {
            return "AddPhoto";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Ln61/d$a0;", "Ln61/d;", "Ldx3/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a0 implements d, dx3.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a0 f132516a = new a0();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/imagepreview";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = false;

        private a0() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a0);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return 174152680;
        }

        public String toString() {
            return "ImagePreview";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Ln61/d$b;", "Ln61/d;", "Ltt3/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b implements d, tt3.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f132519a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/addresssearch";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = false;

        private b() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return 256782369;
        }

        public String toString() {
            return "AddressSearch";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$b0;", "Ln61/d;", "Lzx/c;", "Ls81/h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b0 implements d, zx.c<s81.SetupData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b0 f132522a = new b0();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/institution";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = true;

        private b0() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b0);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return 1442694237;
        }

        public String toString() {
            return "Institution";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$c;", "Ln61/d;", "Lzx/c;", "Lx61/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c implements d, zx.c<x61.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f132525a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/applicationtype";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = true;

        private c() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return -61659953;
        }

        public String toString() {
            return "ApplicationType";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$c0;", "Ln61/d;", "Lzx/c;", "Lx81/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c0 implements d, zx.c<x81.SetupData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c0 f132528a = new c0();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/intro";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = true;

        private c0() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c0);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return 1700832465;
        }

        public String toString() {
            return "Intro";
        }
    }

    /* JADX INFO: renamed from: n61.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u001a\u0010\u0019\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Ln61/d$d;", "Ln61/d;", "Ldx3/b;", "Lzx/c;", "Ldx3/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C3291d implements d, dx3.b, zx.c<dx3.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3291d f132531a = new C3291d();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/attachmentpreview";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = false;

        private C3291d() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C3291d);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return -1829309430;
        }

        public String toString() {
            return "AttachmentPreview";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Ln61/d$d0;", "Ln61/d;", "Lqx3/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d0 implements d, qx3.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d0 f132534a = new d0();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/makepayment";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = false;

        private d0() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d0);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return 1053686493;
        }

        public String toString() {
            return "MakePayment";
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\n\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\n\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Ln61/d$e;", "Ln61/d;", "Lzx/c;", "Ly61/b;", "<init>", "()V", "g", "b", "h", "j", "f", "e", "d", "a", "c", "i", "Ln61/d$e$a;", "Ln61/d$e$b;", "Ln61/d$e$c;", "Ln61/d$e$d;", "Ln61/d$e$e;", "Ln61/d$e$f;", "Ln61/d$e$g;", "Ln61/d$e$h;", "Ln61/d$e$i;", "Ln61/d$e$j;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class e implements d, zx.c<ChildPassportApplicationAttachmentsNavigationParams> {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ln61/d$e$a;", "Ln61/d$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f132537a = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final String route = "ChildPassportApplication/attachments/abroadtreatmentconfirmation";

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private static final boolean isBackupNavigation = true;

            private a() {
                super(null);
            }

            @Override // zx.a
            /* JADX INFO: renamed from: b */
            public String getRoute() {
                return route;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            @Override // p081n61.d
            public boolean g() {
                return isBackupNavigation;
            }

            public int hashCode() {
                return 1093998675;
            }

            public String toString() {
                return "AbroadTreatmentConfirmation";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ln61/d$e$b;", "Ln61/d$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f132540a = new b();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final String route = "ChildPassportApplication/attachments/justification";

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private static final boolean isBackupNavigation = true;

            private b() {
                super(null);
            }

            @Override // zx.a
            /* JADX INFO: renamed from: b */
            public String getRoute() {
                return route;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            @Override // p081n61.d
            public boolean g() {
                return isBackupNavigation;
            }

            public int hashCode() {
                return 639870713;
            }

            public String toString() {
                return "Justification";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ln61/d$e$c;", "Ln61/d$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f132543a = new c();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final String route = "ChildPassportApplication/attachments/kdrconfirmation";

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private static final boolean isBackupNavigation = true;

            private c() {
                super(null);
            }

            @Override // zx.a
            /* JADX INFO: renamed from: b */
            public String getRoute() {
                return route;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            @Override // p081n61.d
            public boolean g() {
                return isBackupNavigation;
            }

            public int hashCode() {
                return 1736320853;
            }

            public String toString() {
                return "KdrConfirmation";
            }
        }

        /* JADX INFO: renamed from: n61.d$e$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ln61/d$e$d;", "Ln61/d$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C3292d extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3292d f132546a = new C3292d();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final String route = "ChildPassportApplication/attachments/newapplicationmoneytransfer";

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private static final boolean isBackupNavigation = true;

            private C3292d() {
                super(null);
            }

            @Override // zx.a
            /* JADX INFO: renamed from: b */
            public String getRoute() {
                return route;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C3292d);
            }

            @Override // p081n61.d
            public boolean g() {
                return isBackupNavigation;
            }

            public int hashCode() {
                return -951928094;
            }

            public String toString() {
                return "NewApplicationMoneyTransfer";
            }
        }

        /* JADX INFO: renamed from: n61.d$e$e, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ln61/d$e$e;", "Ln61/d$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C3293e extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3293e f132549a = new C3293e();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final String route = "ChildPassportApplication/attachments/oldapplicationmoneytransfer";

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private static final boolean isBackupNavigation = true;

            private C3293e() {
                super(null);
            }

            @Override // zx.a
            /* JADX INFO: renamed from: b */
            public String getRoute() {
                return route;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C3293e);
            }

            @Override // p081n61.d
            public boolean g() {
                return isBackupNavigation;
            }

            public int hashCode() {
                return 1039096425;
            }

            public String toString() {
                return "OldApplicationMoneyTransfer";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ln61/d$e$f;", "Ln61/d$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class f extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f132552a = new f();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final String route = "ChildPassportApplication/attachments/otherparentunabletoconsent";

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private static final boolean isBackupNavigation = true;

            private f() {
                super(null);
            }

            @Override // zx.a
            /* JADX INFO: renamed from: b */
            public String getRoute() {
                return route;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            @Override // p081n61.d
            public boolean g() {
                return isBackupNavigation;
            }

            public int hashCode() {
                return 154010379;
            }

            public String toString() {
                return "OtherParentUnableToConsent";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ln61/d$e$g;", "Ln61/d$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class g extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f132555a = new g();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final String route = "ChildPassportApplication/attachments/privilege";

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private static final boolean isBackupNavigation = true;

            private g() {
                super(null);
            }

            @Override // zx.a
            /* JADX INFO: renamed from: b */
            public String getRoute() {
                return route;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof g);
            }

            @Override // p081n61.d
            public boolean g() {
                return isBackupNavigation;
            }

            public int hashCode() {
                return 1643785784;
            }

            public String toString() {
                return "Privilege";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ln61/d$e$h;", "Ln61/d$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class h extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final h f132558a = new h();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final String route = "ChildPassportApplication/attachments/signedconsent";

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private static final boolean isBackupNavigation = true;

            private h() {
                super(null);
            }

            @Override // zx.a
            /* JADX INFO: renamed from: b */
            public String getRoute() {
                return route;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            @Override // p081n61.d
            public boolean g() {
                return isBackupNavigation;
            }

            public int hashCode() {
                return -1842737819;
            }

            public String toString() {
                return "SignedConsent";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ln61/d$e$i;", "Ln61/d$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class i extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final i f132561a = new i();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final String route = "ChildPassportApplication/attachments/technicalissueconfirmation";

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private static final boolean isBackupNavigation = true;

            private i() {
                super(null);
            }

            @Override // zx.a
            /* JADX INFO: renamed from: b */
            public String getRoute() {
                return route;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof i);
            }

            @Override // p081n61.d
            public boolean g() {
                return isBackupNavigation;
            }

            public int hashCode() {
                return -384829142;
            }

            public String toString() {
                return "TechnicalIssueConfirmation";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ln61/d$e$j;", "Ln61/d$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class j extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final j f132564a = new j();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final String route = "ChildPassportApplication/attachments/paymentconfirmation";

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private static final boolean isBackupNavigation = true;

            private j() {
                super(null);
            }

            @Override // zx.a
            /* JADX INFO: renamed from: b */
            public String getRoute() {
                return route;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof j);
            }

            @Override // p081n61.d
            public boolean g() {
                return isBackupNavigation;
            }

            public int hashCode() {
                return -762751001;
            }

            public String toString() {
                return "ToPaymentConfirmation";
            }
        }

        public /* synthetic */ e(fr.k kVar) {
            this();
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        private e() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$e0;", "Ln61/d;", "Lzx/c;", "La91/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e0 implements d, zx.c<a91.SetupData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e0 f132567a = new e0();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/passporttype";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = true;

        private e0() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof e0);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return 1161161831;
        }

        public String toString() {
            return "PassportType";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$f;", "Ln61/d;", "Lzx/c;", "Loq/i0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f implements d, zx.c<oq.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f132570a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/authorizationcheck";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = false;

        private f() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof f);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return -1137867318;
        }

        public String toString() {
            return "AuthorizationCheck";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$f0;", "Ln61/d;", "Lzx/c;", "Li91/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f0 implements d, zx.c<i91.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f0 f132573a = new f0();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/paynow";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = true;

        private f0() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof f0);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return 1374711625;
        }

        public String toString() {
            return "PayNow";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$g;", "Ln61/d;", "Lzx/c;", "Lg71/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class g implements d, zx.c<g71.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f132576a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/childdata";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = true;

        private g() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof g);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return -1905135925;
        }

        public String toString() {
            return "ChildData";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$g0;", "Ln61/d;", "Lzx/c;", "Ld91/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class g0 implements d, zx.c<d91.SetupData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g0 f132579a = new g0();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/paymentstatus";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = true;

        private g0() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof g0);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return -1852974339;
        }

        public String toString() {
            return "PaymentStatus";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$h;", "Ln61/d;", "Lzx/c;", "Lj71/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class h implements d, zx.c<j71.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f132582a = new h();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/childpicker";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = true;

        private h() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof h);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return -829111441;
        }

        public String toString() {
            return "ChildPicker";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$h0;", "Ln61/d;", "Lzx/c;", "Lu61/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class h0 implements d, zx.c<u61.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h0 f132585a = new h0();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/photoattachments";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = true;

        private h0() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof h0);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return 1333789337;
        }

        public String toString() {
            return "PhotoAttachments";
        }
    }

    /* JADX INFO: renamed from: n61.d$i, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ln61/d$i;", "", "<init>", "()V", "", "route", "Ln61/d;", "a", "(Ljava/lang/String;)Ln61/d;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f132588a = new Companion();

        private Companion() {
        }

        public final d a(String route) {
            Object next;
            Iterator it = pq.v.q(c0.f132528a, e0.f132567a, l0.f132607a, s0.f132661a, h.f132582a, u.f132670a, g.f132576a, e.g.f132555a, e.b.f132540a, e.h.f132558a, e.j.f132564a, e.f.f132552a, e.C3293e.f132549a, e.C3292d.f132546a, e.a.f132537a, e.c.f132543a, e.i.f132561a, p0.f132643a, t0.f132667a, s.f132658a, a.f132513a, h0.f132585a, p.f132640a, m.f132610a, n.f132616a, r0.f132655a, x.f132679a, m0.f132613a, b0.f132522a, j.f132592a, c.f132525a, y.f132682a, f0.f132573a, l.f132604a, k.f132598a, k0.f132601a, o0.b.f132634a, i0.f132589a, g0.f132579a).iterator();
            while (it.hasNext()) {
                next = it.next();
                if (fr.t.c(((d) next).getRoute(), route)) {
                    return (d) next;
                }
            }
            next = null;
            return (d) next;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$i0;", "Ln61/d;", "Lzx/c;", "Ll91/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class i0 implements d, zx.c<l91.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i0 f132589a = new i0();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/pickdiscount";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = true;

        private i0() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof i0);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return -296132995;
        }

        public String toString() {
            return "PickDiscount";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$j;", "Ln61/d;", "Lzx/c;", "Loq/i0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class j implements d, zx.c<oq.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f132592a = new j();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/consentmethod";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = true;

        private j() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof j);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return 695896832;
        }

        public String toString() {
            return "ConsentMethod";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$j0;", "Ln61/d;", "Lzx/c;", "Lv81/e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class j0 implements d, zx.c<v81.SetupData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j0 f132595a = new j0();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/pickinstitution";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = false;

        private j0() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof j0);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return 1193239292;
        }

        public String toString() {
            return "PickInstitution";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Ln61/d$k;", "Ln61/d;", "Lru3/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class k implements d, ru3.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f132598a = new k();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/contactdetails";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = true;

        private k() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof k);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return -1903581891;
        }

        public String toString() {
            return "ContactDetails";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$k0;", "Ln61/d;", "Lzx/c;", "Lo91/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class k0 implements d, zx.c<o91.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k0 f132601a = new k0();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/pickupmethod";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = true;

        private k0() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof k0);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return 33861752;
        }

        public String toString() {
            return "PickupMethod";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$l;", "Ln61/d;", "Lzx/c;", "Lm71/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class l implements d, zx.c<m71.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f132604a = new l();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/contactmethod";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = true;

        private l() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof l);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return 1443189382;
        }

        public String toString() {
            return "ContactMethod";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$l0;", "Ln61/d;", "Lzx/c;", "Lr91/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class l0 implements d, zx.c<r91.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l0 f132607a = new l0();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/pickupplace";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = true;

        private l0() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof l0);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return 696789648;
        }

        public String toString() {
            return "PickupPlace";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$m;", "Ln61/d;", "Lzx/c;", "Lr71/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class m implements d, zx.c<r71.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f132610a = new m();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/correspondencecountry";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = true;

        private m() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof m);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return -501009663;
        }

        public String toString() {
            return "CorrespondenceCountry";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$m0;", "Ln61/d;", "Lzx/c;", "Lt91/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class m0 implements d, zx.c<t91.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m0 f132613a = new m0();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/reason";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = true;

        private m0() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof m0);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return 1434984575;
        }

        public String toString() {
            return "Reason";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$n;", "Ln61/d;", "Lzx/c;", "Lu71/g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class n implements d, zx.c<u71.SetupData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f132616a = new n();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/correspondencepicker";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = true;

        private n() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof n);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return -1866820669;
        }

        public String toString() {
            return "CorrespondencePicker";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$n0;", "Ln61/d;", "Lzx/c;", "Lt91/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class n0 implements d, zx.c<t91.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n0 f132619a = new n0();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/reasonpicker";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = false;

        private n0() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof n0);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return -1549698579;
        }

        public String toString() {
            return "ReasonPicker";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Ln61/d$o;", "Ln61/d;", "Lzx/c;", "Ly71/b;", "b", "c", "a", "Ln61/d$o$a;", "Ln61/d$o$b;", "Ln61/d$o$c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface o extends d, zx.c<y71.SetupData> {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ln61/d$o$a;", "Ln61/d$o;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f132622a = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final String route = "ChildPassportApplication/cutbirthplace";

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private static final boolean isBackupNavigation = false;

            private a() {
            }

            @Override // zx.a
            /* JADX INFO: renamed from: b */
            public String getRoute() {
                return route;
            }

            @Override // zx.a
            public /* bridge */ boolean e() {
                return super.e();
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            @Override // p081n61.d
            public boolean g() {
                return isBackupNavigation;
            }

            public int hashCode() {
                return -1601990129;
            }

            public String toString() {
                return "BirthPlace";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ln61/d$o$b;", "Ln61/d$o;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f132625a = new b();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final String route = "ChildPassportApplication/cutfirstname";

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private static final boolean isBackupNavigation = false;

            private b() {
            }

            @Override // zx.a
            /* JADX INFO: renamed from: b */
            public String getRoute() {
                return route;
            }

            @Override // zx.a
            public /* bridge */ boolean e() {
                return super.e();
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            @Override // p081n61.d
            public boolean g() {
                return isBackupNavigation;
            }

            public int hashCode() {
                return -648839692;
            }

            public String toString() {
                return "FirstName";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ln61/d$o$c;", "Ln61/d$o;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f132628a = new c();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final String route = "ChildPassportApplication/cutlastname";

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private static final boolean isBackupNavigation = false;

            private c() {
            }

            @Override // zx.a
            /* JADX INFO: renamed from: b */
            public String getRoute() {
                return route;
            }

            @Override // zx.a
            public /* bridge */ boolean e() {
                return super.e();
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            @Override // p081n61.d
            public boolean g() {
                return isBackupNavigation;
            }

            public int hashCode() {
                return 39205512;
            }

            public String toString() {
                return "LastName";
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Ln61/d$o0;", "Ln61/d;", "Lzx/c;", "Le81/b;", "b", "c", "a", "Ln61/d$o0$a;", "Ln61/d$o0$b;", "Ln61/d$o0$c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface o0 extends d, zx.c<e81.SetupData> {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ln61/d$o0$a;", "Ln61/d$o0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements o0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f132631a = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final String route = "ChildPassportApplication/splitbirthplace";

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private static final boolean isBackupNavigation = false;

            private a() {
            }

            @Override // zx.a
            /* JADX INFO: renamed from: b */
            public String getRoute() {
                return route;
            }

            @Override // zx.a
            public /* bridge */ boolean e() {
                return super.e();
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            @Override // p081n61.d
            public boolean g() {
                return isBackupNavigation;
            }

            public int hashCode() {
                return 1236574071;
            }

            public String toString() {
                return "BirthPlace";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ln61/d$o0$b;", "Ln61/d$o0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements o0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f132634a = new b();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final String route = "ChildPassportApplication/splitfirstname";

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private static final boolean isBackupNavigation = true;

            private b() {
            }

            @Override // zx.a
            /* JADX INFO: renamed from: b */
            public String getRoute() {
                return route;
            }

            @Override // zx.a
            public /* bridge */ boolean e() {
                return super.e();
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            @Override // p081n61.d
            public boolean g() {
                return isBackupNavigation;
            }

            public int hashCode() {
                return 1463210489;
            }

            public String toString() {
                return "Names";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ln61/d$o0$c;", "Ln61/d$o0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements o0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f132637a = new c();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final String route = "ChildPassportApplication/splitlastname";

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private static final boolean isBackupNavigation = false;

            private c() {
            }

            @Override // zx.a
            /* JADX INFO: renamed from: b */
            public String getRoute() {
                return route;
            }

            @Override // zx.a
            public /* bridge */ boolean e() {
                return super.e();
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            @Override // p081n61.d
            public boolean g() {
                return isBackupNavigation;
            }

            public int hashCode() {
                return -1883987124;
            }

            public String toString() {
                return "Surname";
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$p;", "Ln61/d;", "Lzx/c;", "Ld81/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class p implements d, zx.c<d81.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f132640a = new p();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/data_split_display";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = true;

        private p() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof p);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return -897902195;
        }

        public String toString() {
            return "DataSplitDisplay";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$p0;", "Ln61/d;", "Lzx/c;", "Lw91/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class p0 implements d, zx.c<w91.SetupData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p0 f132643a = new p0();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/summary";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = true;

        private p0() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof p0);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return -1403658037;
        }

        public String toString() {
            return "Summary";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$q;", "Ln61/d;", "Lzx/c;", "Luw/j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class q implements d, zx.c<uw.j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f132646a = new q();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/datepicker";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = false;

        private q() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof q);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return 176218775;
        }

        public String toString() {
            return "DatePicker";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$q0;", "Ln61/d;", "Lzx/c;", "Loq/i0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class q0 implements d, zx.c<oq.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q0 f132649a = new q0();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/takestoolong";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = false;

        private q0() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof q0);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return 1139107199;
        }

        public String toString() {
            return "TakesTooLong";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Ln61/d$r;", "Ln61/d;", "Lcb4/e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class r implements d, cb4.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f132652a = new r();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/dialog";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = false;

        private r() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof r);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return 1037863811;
        }

        public String toString() {
            return "Dialog";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Ln61/d$r0;", "Ln61/d;", "Lst3/e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class r0 implements d, st3.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r0 f132655a = new r0();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/terytaddress";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = true;

        private r0() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof r0);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return 1112443731;
        }

        public String toString() {
            return "TerytAddress";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$s;", "Ln61/d;", "Lzx/c;", "Lg81/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class s implements d, zx.c<DocumentPickerNavigationParams> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f132658a = new s();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/document_picker";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = true;

        private s() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof s);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return -1541904188;
        }

        public String toString() {
            return "DocumentPicker";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$s0;", "Ln61/d;", "Lzx/c;", "Lda1/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class s0 implements d, zx.c<da1.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s0 f132661a = new s0();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/whoagrees";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = true;

        private s0() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof s0);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return 403626122;
        }

        public String toString() {
            return "WhoAgrees";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Ln61/d$t;", "Ln61/d;", "Lmv3/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class t implements d, mv3.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f132664a = new t();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/edorauth";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = false;

        private t() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof t);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return -1335002363;
        }

        public String toString() {
            return "EdorAuth";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$t0;", "Ln61/d;", "Lzx/c;", "Lea1/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class t0 implements d, zx.c<ea1.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t0 f132667a = new t0();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/your_data";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = true;

        private t0() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof t0);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return 505916920;
        }

        public String toString() {
            return "YourData";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$u;", "Ln61/d;", "Lzx/c;", "Lk81/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class u implements d, zx.c<k81.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final u f132670a = new u();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/enterchilddata";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = true;

        private u() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof u);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return 1519639081;
        }

        public String toString() {
            return "EnterChildData";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Ln61/d$v;", "Ln61/d;", "Lhb4/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class v implements d, hb4.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v f132673a = new v();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/error";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = false;

        private v() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof v);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return 1697255533;
        }

        public String toString() {
            return "Error";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$w;", "Ln61/d;", "Lzx/c;", "Lm81/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class w implements d, zx.c<m81.SetupData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final w f132676a = new w();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/facedetectionmoduleloader";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = false;

        private w() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof w);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return 475258956;
        }

        public String toString() {
            return "FaceDetectionModuleLoader";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$x;", "Ln61/d;", "Lzx/c;", "Ls71/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class x implements d, zx.c<s71.SetupData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final x f132679a = new x();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/foreginaddress";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = true;

        private x() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof x);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return 2086141883;
        }

        public String toString() {
            return "ForeignAddress";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln61/d$y;", "Ln61/d;", "Lzx/c;", "Lr81/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class y implements d, zx.c<r81.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final y f132682a = new y();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/howtopay";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = true;

        private y() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof y);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return 973729080;
        }

        public String toString() {
            return "HowToPay";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Ln61/d$z;", "Ln61/d;", "Lcw3/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "c", "Z", "g", "()Z", "isBackupNavigation", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class z implements d, cw3.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final z f132685a = new z();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String route = "ChildPassportApplication/identityphoto";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final boolean isBackupNavigation = false;

        private z() {
        }

        @Override // zx.a
        /* JADX INFO: renamed from: b */
        public String getRoute() {
            return route;
        }

        @Override // zx.a
        public /* bridge */ boolean e() {
            return super.e();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof z);
        }

        @Override // p081n61.d
        public boolean g() {
            return isBackupNavigation;
        }

        public int hashCode() {
            return 1559604601;
        }

        public String toString() {
            return "IdentityPhoto";
        }
    }

    boolean g();
}
