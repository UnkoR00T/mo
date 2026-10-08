package y7;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f224951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f224952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final DatagramPacket f224953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Uri f224954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private DatagramSocket f224955i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MulticastSocket f224956j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InetAddress f224957k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f224958l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f224959m;

    public static final class a extends g {
        public a(Throwable th4, int i15) {
            super(th4, i15);
        }
    }

    public y() {
        this(2000);
    }

    @Override // y7.f
    public Uri c() {
        return this.f224954h;
    }

    @Override // y7.f
    public void close() {
        this.f224954h = null;
        MulticastSocket multicastSocket = this.f224956j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) zj.p.q(this.f224957k));
            } catch (IOException unused) {
            }
            this.f224956j = null;
        }
        DatagramSocket datagramSocket = this.f224955i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f224955i = null;
        }
        this.f224957k = null;
        this.f224959m = 0;
        if (this.f224958l) {
            this.f224958l = false;
            r();
        }
    }

    @Override // y7.f
    public long i(j jVar) throws a {
        Uri uri = jVar.f224865a;
        this.f224954h = uri;
        String str = (String) zj.p.q(uri.getHost());
        int port = this.f224954h.getPort();
        s(jVar);
        try {
            this.f224957k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f224957k, port);
            if (this.f224957k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f224956j = multicastSocket;
                multicastSocket.joinGroup(this.f224957k);
                this.f224955i = this.f224956j;
            } else {
                this.f224955i = new DatagramSocket(inetSocketAddress);
            }
            this.f224955i.setSoTimeout(this.f224951e);
            this.f224958l = true;
            t(jVar);
            return -1L;
        } catch (IOException e15) {
            throw new a(e15, 2001);
        } catch (SecurityException e16) {
            throw new a(e16, 2006);
        }
    }

    @Override // t7.h
    public int read(byte[] bArr, int i15, int i16) throws a {
        if (i16 == 0) {
            return 0;
        }
        if (this.f224959m == 0) {
            try {
                ((DatagramSocket) zj.p.q(this.f224955i)).receive(this.f224953g);
                int length = this.f224953g.getLength();
                this.f224959m = length;
                q(length);
            } catch (SocketTimeoutException e15) {
                throw new a(e15, 2002);
            } catch (IOException e16) {
                throw new a(e16, 2001);
            }
        }
        int length2 = this.f224953g.getLength();
        int i17 = this.f224959m;
        int iMin = Math.min(i17, i16);
        System.arraycopy(this.f224952f, length2 - i17, bArr, i15, iMin);
        this.f224959m -= iMin;
        return iMin;
    }

    public y(int i15) {
        this(i15, 8000);
    }

    public y(int i15, int i16) {
        super(true);
        this.f224951e = i16;
        byte[] bArr = new byte[i15];
        this.f224952f = bArr;
        this.f224953g = new DatagramPacket(bArr, 0, i15);
    }
}
