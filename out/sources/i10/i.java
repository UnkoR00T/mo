package i10;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.Looper;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import ju.d2;
import ju.g1;
import ju.p0;
import ju.q0;
import lu.w;
import mu.a0;
import mu.h0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import vy.Coordinates;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001(\u0018\u0000 \u00192\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00160\u0015H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0017¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Li10/i;", "Luy/d;", "Landroid/content/Context;", "context", "Lkh/c;", "fusedLocationProviderClient", "<init>", "(Landroid/content/Context;Lkh/c;)V", "Lju/d2;", "m", "()Lju/d2;", "Lmu/a0;", "", "n", "()Lmu/a0;", "Loq/i0;", "a", "()V", "e", "d", "()Z", "Lmu/g;", "Ldx/i;", "Ldx/b;", "Lvy/c;", "g", "()Lmu/g;", "Lvy/j;", "priority", "", "timeout", "Lvy/d;", "f", "(Lvy/j;J)Lmu/g;", "b", "Landroid/content/Context;", "c", "Lkh/c;", "Lmu/a0;", "gpsStatus", "i10/i$e", "Li10/i$e;", "gpsStatusReceiver", "Lcom/google/android/gms/location/LocationRequest;", "Loq/k;", "o", "()Lcom/google/android/gms/location/LocationRequest;", "locationRequest", "sensor_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements uy.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final kh.c fusedLocationProviderClient;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a0<Boolean> gpsStatus = h0.b(0, 0, null, 7, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final e gpsStatusReceiver = new e();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final oq.k locationRequest = oq.l.a(new er.a() { // from class: i10.h
        @Override // er.a
        public final Object a() {
            return i.p();
        }
    });

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f88143e;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f88143e;
            if (i15 == 0) {
                u.b(obj);
                a0 a0Var = i.this.gpsStatus;
                Boolean boolA = vq.b.a(i.this.d());
                this.f88143e = 1;
                if (a0Var.F(boolA, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return i.this.new b(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/w;", "Lvy/d;", "Loq/i0;", "<anonymous>", "(Llu/w;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<w<? super vy.d>, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f88145e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f88146f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f88147g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f88148h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ i f88149j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ vy.j f88150k;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0015\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001¢\u0006\u0002\b\u0004*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lju/p0;", "Lvh/l;", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lju/p0;)Lvh/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.p<p0, tq.e<? super vh.l<Location>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f88151e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ i f88152f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ vy.j f88153g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ vh.b f88154h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ w<vy.d> f88155j;

            /* JADX INFO: renamed from: i10.i$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C2073a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f88156a;

                static {
                    int[] iArr = new int[vy.j.values().length];
                    try {
                        iArr[vy.j.PRIORITY_HIGH_ACCURACY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[vy.j.PRIORITY_BALANCED_POWER_ACCURACY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[vy.j.PRIORITY_LOW_POWER.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[vy.j.PRIORITY_PASSIVE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f88156a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(i iVar, vy.j jVar, vh.b bVar, w<? super vy.d> wVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f88152f = iVar;
                this.f88153g = jVar;
                this.f88154h = bVar;
                this.f88155j = wVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 X(w wVar, Location location) {
                if (location != null) {
                    wVar.d(new vy.d.Acquired(new Coordinates(location.getLatitude(), location.getLongitude())));
                } else {
                    wVar.d(vy.d.b.f208683a);
                }
                return i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void Y(er.l lVar, Object obj) {
                lVar.b(obj);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void Z(w wVar, Exception exc) {
                wVar.d(vy.d.b.f208683a);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                int i15;
                uq.b.e();
                if (this.f88151e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                kh.c cVar = this.f88152f.fusedLocationProviderClient;
                int i16 = C2073a.f88156a[this.f88153g.ordinal()];
                if (i16 == 1) {
                    i15 = 100;
                } else if (i16 == 2) {
                    i15 = 102;
                } else if (i16 == 3) {
                    i15 = 104;
                } else {
                    if (i16 != 4) {
                        throw new oq.p();
                    }
                    i15 = 105;
                }
                vh.l<Location> lVarC = cVar.c(i15, this.f88154h.b());
                final w<vy.d> wVar = this.f88155j;
                final er.l lVar = new er.l() { // from class: i10.k
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return i.c.a.X(wVar, (Location) obj2);
                    }
                };
                vh.l<Location> lVarG = lVarC.g(new vh.h() { // from class: i10.l
                    @Override // vh.h
                    public final void a(Object obj2) {
                        i.c.a.Y(lVar, obj2);
                    }
                });
                final w<vy.d> wVar2 = this.f88155j;
                return lVarG.e(new vh.g() { // from class: i10.m
                    @Override // vh.g
                    public final void c(Exception exc) {
                        i.c.a.Z(wVar2, exc);
                    }
                });
            }

            @Override // er.p
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super vh.l<Location>> eVar) {
                return ((a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f88152f, this.f88153g, this.f88154h, this.f88155j, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j15, i iVar, vy.j jVar, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f88148h = j15;
            this.f88149j = iVar;
            this.f88150k = jVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(vh.b bVar) {
            bVar.a();
            return i0.f148189a;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x005f  */
        /* JADX WARN: Code duplicated, block: B:24:0x0065  */
        /* JADX WARN: Code duplicated, block: B:26:0x0069  */
        /* JADX WARN: Code duplicated, block: B:32:0x008b  */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
        
            if (lu.u.b(r5, r13, r12) == r7) goto L29;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r13) throws java.lang.Exception {
            /*
                r12 = this;
                java.lang.Object r0 = r12.f88147g
                r5 = r0
                lu.w r5 = (lu.w) r5
                java.lang.Object r7 = uq.b.e()
                int r0 = r12.f88146f
                r8 = 2
                r9 = 1
                if (r0 == 0) goto L30
                if (r0 == r9) goto L24
                if (r0 != r8) goto L1c
                java.lang.Object r0 = r12.f88145e
                vh.b r0 = (vh.b) r0
                oq.u.b(r13)
                goto L88
            L1c:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L24:
                java.lang.Object r0 = r12.f88145e
                r1 = r0
                vh.b r1 = (vh.b) r1
                oq.u.b(r13)     // Catch: java.lang.Exception -> L2d
                goto L6e
            L2d:
                r0 = move-exception
                r13 = r0
                goto L5b
            L30:
                oq.u.b(r13)
                vh.b r4 = new vh.b
                r4.<init>()
                vy.d$c r13 = vy.d.c.f208684a
                r5.d(r13)
                long r10 = r12.f88148h     // Catch: java.lang.Exception -> L58
                i10.i$c$a r1 = new i10.i$c$a     // Catch: java.lang.Exception -> L58
                i10.i r2 = r12.f88149j     // Catch: java.lang.Exception -> L58
                vy.j r3 = r12.f88150k     // Catch: java.lang.Exception -> L58
                r6 = 0
                r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L58
                r12.f88147g = r5     // Catch: java.lang.Exception -> L58
                r12.f88145e = r4     // Catch: java.lang.Exception -> L58
                r12.f88146f = r9     // Catch: java.lang.Exception -> L58
                java.lang.Object r13 = ju.g3.c(r10, r1, r12)     // Catch: java.lang.Exception -> L58
                if (r13 != r7) goto L56
                goto L87
            L56:
                r1 = r4
                goto L6e
            L58:
                r0 = move-exception
                r13 = r0
                r1 = r4
            L5b:
                boolean r0 = r13 instanceof ju.e3
                if (r0 == 0) goto L65
                vy.d$d r13 = vy.d.C5485d.f208685a
                r5.d(r13)
                goto L6e
            L65:
                boolean r0 = r13 instanceof java.util.concurrent.CancellationException
                if (r0 != 0) goto L8b
                vy.d$b r13 = vy.d.b.f208683a
                r5.d(r13)
            L6e:
                i10.j r13 = new i10.j
                r13.<init>()
                java.lang.Object r0 = vq.j.a(r5)
                r12.f88147g = r0
                java.lang.Object r0 = vq.j.a(r1)
                r12.f88145e = r0
                r12.f88146f = r8
                java.lang.Object r13 = lu.u.b(r5, r13, r12)
                if (r13 != r7) goto L88
            L87:
                return r7
            L88:
                oq.i0 r13 = oq.i0.f148189a
                return r13
            L8b:
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: i10.i.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(w<? super vy.d> wVar, tq.e<? super i0> eVar) {
            return ((c) v(wVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = new c(this.f88148h, this.f88149j, this.f88150k, eVar);
            cVar.f88147g = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Llu/w;", "Ldx/i;", "Ldx/b;", "Lvy/c;", "Loq/i0;", "<anonymous>", "(Llu/w;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<w<? super dx.i<? extends dx.b, ? extends Coordinates>>, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f88157e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f88158f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f88159g;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"i10/i$d$a", "Lkh/e;", "Lcom/google/android/gms/location/LocationResult;", "locationResult", "Loq/i0;", "b", "(Lcom/google/android/gms/location/LocationResult;)V", "sensor_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends kh.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ w<dx.i<? extends dx.b, Coordinates>> f88161a;

            /* JADX WARN: Multi-variable type inference failed */
            a(w<? super dx.i<? extends dx.b, Coordinates>> wVar) {
                this.f88161a = wVar;
            }

            @Override // kh.e
            public void b(LocationResult locationResult) {
                super.b(locationResult);
                Location locationH = locationResult.h();
                if (locationH != null) {
                    lu.k.j(this.f88161a.d(new dx.i.Right(new Coordinates(locationH.getLatitude(), locationH.getLongitude()))));
                } else {
                    lu.k.j(this.f88161a.d(new dx.i.Left(new dx.b.Generic(new Exception("something went wrong")))));
                }
            }
        }

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void X(i iVar, final w wVar, vh.l lVar) {
            if (lVar.q()) {
                iVar.fusedLocationProviderClient.k().c(new vh.f() { // from class: i10.p
                    @Override // vh.f
                    public final void a(vh.l lVar2) {
                        i.d.Y(wVar, lVar2);
                    }
                });
            } else {
                lu.k.j(wVar.d(new dx.i.Left(new dx.b.Generic(new Exception("something went wrong")))));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Y(w wVar, vh.l lVar) {
            if ((!lVar.q() || ((LocationAvailability) lVar.m()).h()) && lVar.q()) {
                return;
            }
            lu.k.j(wVar.d(new dx.i.Left(new dx.b.Generic(new Exception("something went wrong")))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 Z(i iVar, a aVar) {
            iVar.fusedLocationProviderClient.h(aVar);
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final w wVar = (w) this.f88159g;
            Object objE = uq.b.e();
            int i15 = this.f88158f;
            if (i15 == 0) {
                u.b(obj);
                final a aVar = new a(wVar);
                vh.l<Void> lVarJ = i.this.fusedLocationProviderClient.j(i.this.o(), aVar, Looper.getMainLooper());
                final i iVar = i.this;
                lVarJ.c(new vh.f() { // from class: i10.n
                    @Override // vh.f
                    public final void a(vh.l lVar) {
                        i.d.X(iVar, wVar, lVar);
                    }
                });
                final i iVar2 = i.this;
                er.a aVar2 = new er.a() { // from class: i10.o
                    @Override // er.a
                    public final Object a() {
                        return i.d.Z(iVar2, aVar);
                    }
                };
                this.f88159g = vq.j.a(wVar);
                this.f88157e = vq.j.a(aVar);
                this.f88158f = 1;
                if (lu.u.b(wVar, aVar2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object B(w<? super dx.i<? extends dx.b, Coordinates>> wVar, tq.e<? super i0> eVar) {
            return ((d) v(wVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = i.this.new d(eVar);
            dVar.f88159g = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"i10/i$e", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Loq/i0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "sensor_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e extends BroadcastReceiver {
        e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            i.this.m();
        }
    }

    public i(Context context, kh.c cVar) {
        this.context = context;
        this.fusedLocationProviderClient = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d2 m() {
        return ju.k.d(q0.a(g1.b()), null, null, new b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocationRequest o() {
        return (LocationRequest) this.locationRequest.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocationRequest p() {
        return new LocationRequest.a(5000L).c(2).j(102).h(100.0f).k(false).a();
    }

    @Override // uy.d
    public void a() {
        px.f.f163100a.g("Registering GPS receiver", px.c.a(this));
        this.context.registerReceiver(this.gpsStatusReceiver, new IntentFilter("android.location.PROVIDERS_CHANGED"));
    }

    @Override // uy.d
    public boolean d() {
        return ((LocationManager) this.context.getSystemService("location")).isProviderEnabled("gps");
    }

    @Override // uy.d
    public void e() {
        px.f.f163100a.g("Un-registering GPS receiver", px.c.a(this));
        this.context.unregisterReceiver(this.gpsStatusReceiver);
    }

    @Override // uy.d
    @SuppressLint({"MissingPermission"})
    public mu.g<vy.d> f(vy.j priority, long timeout) {
        return mu.i.e(new c(timeout, this, priority, null));
    }

    @Override // uy.d
    @SuppressLint({"MissingPermission"})
    public mu.g<dx.i<dx.b, Coordinates>> g() {
        return mu.i.e(new d(null));
    }

    @Override // uy.d
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public a0<Boolean> b() {
        return this.gpsStatus;
    }
}
