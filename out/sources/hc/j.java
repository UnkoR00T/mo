package hc;

import java.io.Serializable;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends vq.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f83074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f83075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Serializable f83076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Serializable f83077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f83078h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f83079j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f83080k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f83081l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, vq.d dVar) {
        super(dVar);
        this.f83080k = kVar;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f83079j = obj;
        this.f83081l |= PKIFailureInfo.systemUnavail;
        return this.f83080k.b(null, null, this);
    }
}
