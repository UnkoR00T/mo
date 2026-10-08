package com.google.android.libraries.vision.visionkit.pipeline.alt;

import androidx.annotation.Keep;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.im;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.lv;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.tl;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zl;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import qi.e;
import qi.w3;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@UsedByNative("pipeline_jni.cc")
public class PipelineException extends Exception {
    private static final String ROOT_CAUSE_DELIMITER = "#vk ";
    private final d statusCode;
    private final String statusMessage;
    private final w3 visionkitStatus;

    public PipelineException(int i15, String str) {
        super(d.values()[i15].b() + ": " + str);
        this.statusCode = d.values()[i15];
        this.statusMessage = str;
        this.visionkitStatus = null;
    }

    public List<e> getComponentStatuses() {
        w3 w3Var = this.visionkitStatus;
        return w3Var != null ? w3Var.I() : im.k();
    }

    public tl<String> getRootCauseMessage() {
        Object next;
        Object obj;
        if (!this.statusMessage.contains(ROOT_CAUSE_DELIMITER)) {
            return tl.d();
        }
        List listB = zl.a(ROOT_CAUSE_DELIMITER).b(this.statusMessage);
        if (listB instanceof List) {
            List list = listB;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            obj = list.get(list.size() - 1);
        } else {
            Iterator it = listB.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        }
        return tl.e((String) obj);
    }

    public d getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    private PipelineException(w3 w3Var) {
        super(d.values()[w3Var.E()].b() + ": " + w3Var.H());
        this.statusCode = d.values()[w3Var.E()];
        this.statusMessage = w3Var.H();
        this.visionkitStatus = w3Var;
    }

    @Keep
    @UsedByNative("pipeline_jni.cc")
    PipelineException(byte[] bArr) {
        this(w3.G(bArr, lv.a()));
    }
}
