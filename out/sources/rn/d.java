package rn;

import fv.c0;
import fv.x;
import ge4.h;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;
import uu.o;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lrn/d;", "T", "Lge4/h;", "Lfv/c0;", "Lfv/x;", CMSAttributeTableGenerator.CONTENT_TYPE, "Luu/o;", "saver", "Lrn/e;", "serializer", "<init>", "(Lfv/x;Luu/o;Lrn/e;)V", "value", "b", "(Ljava/lang/Object;)Lfv/c0;", "a", "Lfv/x;", "Luu/o;", "c", "Lrn/e;", "retrofit2-kotlinx-serialization-converter"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d<T> implements h<T, c0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x contentType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o<T> saver;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e serializer;

    /* JADX WARN: Multi-variable type inference failed */
    public d(x xVar, o<? super T> oVar, e eVar) {
        this.contentType = xVar;
        this.saver = oVar;
        this.serializer = eVar;
    }

    @Override // ge4.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c0 a(T value) {
        return this.serializer.d(this.contentType, this.saver, value);
    }
}
