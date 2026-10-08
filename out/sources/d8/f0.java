package d8;

import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.text.TextUtils;
import b8.e2;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0.c f40199d = new a0.c() { // from class: d8.c0
        @Override // d8.a0.c
        public final a0 a(UUID uuid) {
            return f0.o(uuid);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UUID f40200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediaDrm f40201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40202c;

    private static class a {
        public static boolean a(MediaDrm mediaDrm, String str, int i15) {
            return mediaDrm.requiresSecureDecoder(str, i15);
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, e2 e2Var) {
            LogSessionId logSessionIdA = e2Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            e0.a(zj.p.q(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionIdA);
        }
    }

    private f0(UUID uuid) {
        zj.p.q(uuid);
        zj.p.e(!t7.f.f188171c.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f40200a = uuid;
        MediaDrm mediaDrm = new MediaDrm(v(uuid));
        this.f40201b = mediaDrm;
        this.f40202c = 1;
        if (t7.f.f188173e.equals(uuid) && C()) {
            y(mediaDrm);
        }
    }

    private static t7.l.b A(UUID uuid, List<t7.l.b> list) {
        if (!t7.f.f188173e.equals(uuid)) {
            return list.get(0);
        }
        if (Build.VERSION.SDK_INT >= 28 && list.size() > 1) {
            t7.l.b bVar = list.get(0);
            int i15 = 0;
            int length = 0;
            while (true) {
                if (i15 >= list.size()) {
                    byte[] bArr = new byte[length];
                    int i16 = 0;
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        byte[] bArr2 = (byte[]) zj.p.q(list.get(i17).f188328e);
                        int length2 = bArr2.length;
                        System.arraycopy(bArr2, 0, bArr, i16, length2);
                        i16 += length2;
                    }
                    return bVar.a(bArr);
                }
                t7.l.b bVar2 = list.get(i15);
                byte[] bArr3 = (byte[]) zj.p.q(bVar2.f188328e);
                if (!Objects.equals(bVar2.f188327d, bVar.f188327d) || !Objects.equals(bVar2.f188326c, bVar.f188326c) || !i9.s.c(bArr3)) {
                    break;
                }
                length += bArr3.length;
                i15++;
            }
        }
        for (int i18 = 0; i18 < list.size(); i18++) {
            t7.l.b bVar3 = list.get(i18);
            if (i9.s.g((byte[]) zj.p.q(bVar3.f188328e)) == 1) {
                return bVar3;
            }
        }
        return list.get(0);
    }

    private boolean B() {
        if (!this.f40200a.equals(t7.f.f188173e)) {
            return this.f40200a.equals(t7.f.f188172d);
        }
        String strZ = z("version");
        return (strZ.startsWith("v5.") || strZ.startsWith("14.") || strZ.startsWith("15.") || strZ.startsWith("16.0")) ? false : true;
    }

    private static boolean C() {
        return "ASUS_Z00AD".equals(Build.MODEL);
    }

    public static f0 D(UUID uuid) throws l0 {
        try {
            return new f0(uuid);
        } catch (UnsupportedSchemeException e15) {
            throw new l0(1, e15);
        } catch (Exception e16) {
            throw new l0(2, e16);
        }
    }

    public static /* synthetic */ a0 o(UUID uuid) {
        try {
            return D(uuid);
        } catch (l0 unused) {
            w7.t.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new y();
        }
    }

    public static /* synthetic */ void p(f0 f0Var, a0.b bVar, MediaDrm mediaDrm, byte[] bArr, int i15, int i16, byte[] bArr2) {
        f0Var.getClass();
        bVar.a(f0Var, bArr, i15, i16, bArr2);
    }

    private static byte[] q(byte[] bArr) {
        w7.c0 c0Var = new w7.c0(bArr);
        int iD = c0Var.D();
        short sF = c0Var.F();
        short sF2 = c0Var.F();
        if (sF != 1 || sF2 != 1) {
            w7.t.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short sF3 = c0Var.F();
        Charset charset = StandardCharsets.UTF_16LE;
        String strO = c0Var.O(sF3, charset);
        if (strO.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strO.indexOf("</DATA>");
        if (iIndexOf == -1) {
            w7.t.h("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = strO.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strO.substring(iIndexOf);
        int i15 = iD + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i15);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i15);
        byteBufferAllocate.putShort(sF);
        byteBufferAllocate.putShort(sF2);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(charset));
        return byteBufferAllocate.array();
    }

    private String r(String str) {
        if ("<LA_URL>https://x</LA_URL>".equals(str)) {
            return "";
        }
        if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(str)) {
            String strZ = z("version");
            if (Objects.equals(strZ, "1.2") || Objects.equals(strZ, "aidl-1")) {
                return "";
            }
        }
        return str;
    }

    private static byte[] s(UUID uuid, byte[] bArr) {
        return t7.f.f188172d.equals(uuid) ? d8.a.a(bArr) : bArr;
    }

    private static byte[] t(UUID uuid, byte[] bArr) {
        byte[] bArrE;
        i9.s.a aVarD;
        UUID uuid2 = t7.f.f188174f;
        if (uuid2.equals(uuid)) {
            byte[] bArrE2 = i9.s.e(bArr, uuid);
            if (bArrE2 != null) {
                bArr = bArrE2;
            }
            bArr = i9.s.a(uuid2, q(bArr));
        }
        if (w(uuid) && (aVarD = i9.s.d(bArr)) != null) {
            bArr = i9.s.b(t7.f.f188171c, aVarD.f90474d, aVarD.f90473c);
        }
        if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if (("AFTB".equals(str) || "AFTS".equals(str) || "AFTM".equals(str) || "AFTT".equals(str)) && (bArrE = i9.s.e(bArr, uuid)) != null) {
                return bArrE;
            }
        }
        return bArr;
    }

    private static String u(UUID uuid, String str) {
        return str;
    }

    private static UUID v(UUID uuid) {
        return w(uuid) ? t7.f.f188171c : uuid;
    }

    private static boolean w(UUID uuid) {
        return Build.VERSION.SDK_INT < 27 && Objects.equals(uuid, t7.f.f188172d);
    }

    private static void y(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    @Override // d8.a0
    public Map<String, String> a(byte[] bArr) {
        return this.f40201b.queryKeyStatus(bArr);
    }

    @Override // d8.a0
    public synchronized void b() {
        int i15 = this.f40202c - 1;
        this.f40202c = i15;
        if (i15 == 0) {
            this.f40201b.release();
        }
    }

    @Override // d8.a0
    public a0.d c() {
        MediaDrm.ProvisionRequest provisionRequest = this.f40201b.getProvisionRequest();
        return new a0.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // d8.a0
    public byte[] d() {
        return this.f40201b.openSession();
    }

    @Override // d8.a0
    public void e(byte[] bArr, byte[] bArr2) {
        this.f40201b.restoreKeys(bArr, bArr2);
    }

    @Override // d8.a0
    public void f(byte[] bArr) throws DeniedByServerException {
        this.f40201b.provideProvisionResponse(bArr);
    }

    @Override // d8.a0
    public int g() {
        return 2;
    }

    @Override // d8.a0
    public void h(byte[] bArr, e2 e2Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                a.b(this.f40201b, bArr, e2Var);
            } catch (UnsupportedOperationException unused) {
                w7.t.h("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // d8.a0
    public void j(final a0.b bVar) {
        this.f40201b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: d8.d0
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i15, int i16, byte[] bArr2) {
                f0.p(this.f40196a, bVar, mediaDrm, bArr, i15, i16, bArr2);
            }
        });
    }

    @Override // d8.a0
    public boolean k(byte[] bArr, String str) throws Throwable {
        if (Build.VERSION.SDK_INT >= 31 && B()) {
            MediaDrm mediaDrm = this.f40201b;
            return a.a(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
        }
        MediaCrypto mediaCrypto = null;
        try {
            try {
                MediaCrypto mediaCrypto2 = new MediaCrypto(v(this.f40200a), bArr);
                try {
                    boolean zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                    mediaCrypto2.release();
                    return zRequiresSecureDecoderComponent;
                } catch (MediaCryptoException unused) {
                    mediaCrypto = mediaCrypto2;
                    boolean z15 = !this.f40200a.equals(t7.f.f188172d);
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    return z15;
                } catch (Throwable th4) {
                    th = th4;
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (MediaCryptoException unused2) {
        }
    }

    @Override // d8.a0
    public void l(byte[] bArr) {
        this.f40201b.closeSession(bArr);
    }

    @Override // d8.a0
    public byte[] m(byte[] bArr, byte[] bArr2) {
        if (t7.f.f188172d.equals(this.f40200a)) {
            bArr2 = d8.a.b(bArr2);
        }
        return this.f40201b.provideKeyResponse(bArr, bArr2);
    }

    @Override // d8.a0
    @SuppressLint({"WrongConstant"})
    public a0.a n(byte[] bArr, List<t7.l.b> list, int i15, HashMap<String, String> map) throws NotProvisionedException {
        t7.l.b bVarA;
        byte[] bArrT;
        String strU;
        if (list != null) {
            bVarA = A(this.f40200a, list);
            bArrT = t(this.f40200a, (byte[]) zj.p.q(bVarA.f188328e));
            strU = u(this.f40200a, bVarA.f188327d);
        } else {
            bVarA = null;
            bArrT = null;
            strU = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f40201b.getKeyRequest(bArr, bArrT, strU, i15, map);
        byte[] bArrS = s(this.f40200a, keyRequest.getData());
        String strR = r(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(strR) && bVarA != null && !TextUtils.isEmpty(bVarA.f188326c)) {
            strR = bVarA.f188326c;
        }
        return new a0.a(bArrS, strR, keyRequest.getRequestType());
    }

    @Override // d8.a0
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public b0 i(byte[] bArr) {
        return new b0(v(this.f40200a), bArr);
    }

    public String z(String str) {
        return this.f40201b.getPropertyString(str);
    }
}
