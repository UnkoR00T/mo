package oc;

import android.content.res.AssetFileDescriptor;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.util.concurrent.Callable;
import p071kotlin.Metadata;
import vv.b0;
import zc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Loc/s;", "Lzc/n;", "options", "", "animated", "Landroid/graphics/ImageDecoder$Source;", "b", "(Loc/s;Lzc/n;Z)Landroid/graphics/ImageDecoder$Source;", "coil-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z {
    public static final ImageDecoder.Source b(s sVar, Options options, boolean z15) {
        b0 b0VarL3;
        if (sVar.getFileSystem() == vv.k.f208405b && (b0VarL3 = sVar.L3()) != null) {
            return ImageDecoder.createSource(b0VarL3.toFile());
        }
        s.a aVarE = sVar.e();
        if (aVarE instanceof a) {
            return ImageDecoder.createSource(options.getContext().getAssets(), ((a) aVarE).getFilePath());
        }
        if ((aVarE instanceof e) && Build.VERSION.SDK_INT >= 29) {
            try {
                final AssetFileDescriptor assetFileDescriptor = ((e) aVarE).getAssetFileDescriptor();
                Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource((Callable<AssetFileDescriptor>) new Callable() { // from class: oc.y
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return z.c(assetFileDescriptor);
                    }
                });
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (aVarE instanceof u) {
            u uVar = (u) aVarE;
            if (fr.t.c(uVar.getPackageName(), options.getContext().getPackageName())) {
                return ImageDecoder.createSource(options.getContext().getResources(), uVar.getResId());
            }
        }
        if (!(aVarE instanceof d)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !z15 || ((d) aVarE).getByteBuffer().isDirect()) {
            return ImageDecoder.createSource(((d) aVarE).getByteBuffer());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AssetFileDescriptor c(AssetFileDescriptor assetFileDescriptor) {
        return assetFileDescriptor;
    }
}
