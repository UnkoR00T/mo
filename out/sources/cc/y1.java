package cc;

import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import dc.NetworkRequestCompat;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\"\u001a\u00020!2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0007¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010$\u001a\u00020!H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020!H\u0001¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020!2\u0006\u0010*\u001a\u00020'H\u0001¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcc/y1;", "", "<init>", "()V", "Lub/o0$c;", "state", "", "k", "(Lub/o0$c;)I", "value", "g", "(I)Lub/o0$c;", "Lub/a;", "backoffPolicy", "a", "(Lub/a;)I", "d", "(I)Lub/a;", "Lub/x;", "networkType", "h", "(Lub/x;)I", "e", "(I)Lub/x;", "Lub/f0;", "policy", "i", "(Lub/f0;)I", "f", "(I)Lub/f0;", "", "Lub/d$c;", "triggers", "", "j", "(Ljava/util/Set;)[B", "bytes", "b", "([B)Ljava/util/Set;", "Ldc/o;", "l", "([B)Ldc/o;", "requestCompat", "c", "(Ldc/o;)[B", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y1 f25168a = new y1();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f25170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f25171c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f25172d;

        static {
            int[] iArr = new int[ub.o0.c.values().length];
            try {
                iArr[ub.o0.c.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ub.o0.c.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ub.o0.c.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ub.o0.c.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ub.o0.c.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ub.o0.c.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f25169a = iArr;
            int[] iArr2 = new int[ub.a.values().length];
            try {
                iArr2[ub.a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ub.a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f25170b = iArr2;
            int[] iArr3 = new int[ub.x.values().length];
            try {
                iArr3[ub.x.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ub.x.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[ub.x.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ub.x.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[ub.x.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            f25171c = iArr3;
            int[] iArr4 = new int[ub.f0.values().length];
            try {
                iArr4[ub.f0.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[ub.f0.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            f25172d = iArr4;
        }
    }

    private y1() {
    }

    public static final int a(ub.a backoffPolicy) {
        int i15 = a.f25170b[backoffPolicy.ordinal()];
        if (i15 == 1) {
            return 0;
        }
        if (i15 == 2) {
            return 1;
        }
        throw new oq.p();
    }

    public static final Set<ub.d.c> b(byte[] bytes) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i15 = objectInputStream.readInt();
                    for (int i16 = 0; i16 < i15; i16++) {
                        linkedHashSet.add(new ub.d.c(Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean()));
                    }
                    oq.i0 i0Var = oq.i0.f148189a;
                    ar.b.a(objectInputStream, null);
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        ar.b.a(objectInputStream, th4);
                        throw th5;
                    }
                }
            } catch (Throwable th6) {
                try {
                    throw th6;
                } catch (Throwable th7) {
                    ar.b.a(byteArrayInputStream, th6);
                    throw th7;
                }
            }
        } catch (IOException e15) {
            e15.printStackTrace();
        }
        oq.i0 i0Var2 = oq.i0.f148189a;
        ar.b.a(byteArrayInputStream, null);
        return linkedHashSet;
    }

    public static final byte[] c(NetworkRequestCompat requestCompat) {
        if (Build.VERSION.SDK_INT < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequestB = requestCompat.b();
        if (networkRequestB == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                int[] iArrC = dc.p.c(networkRequestB);
                int[] iArrB = dc.p.b(networkRequestB);
                objectOutputStream.writeInt(iArrC.length);
                for (int i15 : iArrC) {
                    objectOutputStream.writeInt(i15);
                }
                objectOutputStream.writeInt(iArrB.length);
                for (int i16 : iArrB) {
                    objectOutputStream.writeInt(i16);
                }
                oq.i0 i0Var = oq.i0.f148189a;
                ar.b.a(objectOutputStream, null);
                ar.b.a(byteArrayOutputStream, null);
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    ar.b.a(objectOutputStream, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                ar.b.a(byteArrayOutputStream, th6);
                throw th7;
            }
        }
    }

    public static final ub.a d(int value) {
        if (value == 0) {
            return ub.a.EXPONENTIAL;
        }
        if (value == 1) {
            return ub.a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to BackoffPolicy");
    }

    public static final ub.x e(int value) {
        if (value == 0) {
            return ub.x.NOT_REQUIRED;
        }
        if (value == 1) {
            return ub.x.CONNECTED;
        }
        if (value == 2) {
            return ub.x.UNMETERED;
        }
        if (value == 3) {
            return ub.x.NOT_ROAMING;
        }
        if (value == 4) {
            return ub.x.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && value == 5) {
            return ub.x.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to NetworkType");
    }

    public static final ub.f0 f(int value) {
        if (value == 0) {
            return ub.f0.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (value == 1) {
            return ub.f0.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to OutOfQuotaPolicy");
    }

    public static final ub.o0.c g(int value) {
        if (value == 0) {
            return ub.o0.c.ENQUEUED;
        }
        if (value == 1) {
            return ub.o0.c.RUNNING;
        }
        if (value == 2) {
            return ub.o0.c.SUCCEEDED;
        }
        if (value == 3) {
            return ub.o0.c.FAILED;
        }
        if (value == 4) {
            return ub.o0.c.BLOCKED;
        }
        if (value == 5) {
            return ub.o0.c.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to State");
    }

    public static final int h(ub.x networkType) {
        int i15 = a.f25171c[networkType.ordinal()];
        if (i15 == 1) {
            return 0;
        }
        if (i15 == 2) {
            return 1;
        }
        if (i15 == 3) {
            return 2;
        }
        if (i15 == 4) {
            return 3;
        }
        if (i15 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && networkType == ub.x.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
    }

    public static final int i(ub.f0 policy) {
        int i15 = a.f25172d[policy.ordinal()];
        if (i15 == 1) {
            return 0;
        }
        if (i15 == 2) {
            return 1;
        }
        throw new oq.p();
    }

    public static final byte[] j(Set<ub.d.c> triggers) {
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                for (ub.d.c cVar : triggers) {
                    objectOutputStream.writeUTF(cVar.getUri().toString());
                    objectOutputStream.writeBoolean(cVar.getIsTriggeredForDescendants());
                }
                oq.i0 i0Var = oq.i0.f148189a;
                ar.b.a(objectOutputStream, null);
                ar.b.a(byteArrayOutputStream, null);
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    ar.b.a(objectOutputStream, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                ar.b.a(byteArrayOutputStream, th6);
                throw th7;
            }
        }
    }

    public static final int k(ub.o0.c state) {
        switch (a.f25169a[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new oq.p();
        }
    }

    public static final NetworkRequestCompat l(byte[] bytes) {
        if (Build.VERSION.SDK_INT < 28 || bytes.length == 0) {
            return new NetworkRequestCompat(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i15 = objectInputStream.readInt();
                int[] iArr = new int[i15];
                for (int i16 = 0; i16 < i15; i16++) {
                    iArr[i16] = objectInputStream.readInt();
                }
                int i17 = objectInputStream.readInt();
                int[] iArr2 = new int[i17];
                for (int i18 = 0; i18 < i17; i18++) {
                    iArr2[i18] = objectInputStream.readInt();
                }
                NetworkRequestCompat networkRequestCompatB = dc.m.f40764a.b(iArr2, iArr);
                ar.b.a(objectInputStream, null);
                ar.b.a(byteArrayInputStream, null);
                return networkRequestCompatB;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    ar.b.a(objectInputStream, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                ar.b.a(byteArrayInputStream, th6);
                throw th7;
            }
        }
    }
}
