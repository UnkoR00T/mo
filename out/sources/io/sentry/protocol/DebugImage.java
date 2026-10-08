package io.sentry.protocol;

import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class DebugImage implements d2 {
    public static final String JVM = "jvm";
    public static final String PROGUARD = "proguard";
    private String arch;
    private String codeFile;
    private String codeId;
    private String debugFile;
    private String debugId;
    private String imageAddr;
    private Long imageSize;
    private String type;
    private Map<String, Object> unknown;
    private String uuid;

    public static final class a implements t1<DebugImage> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DebugImage a(k3 k3Var, v0 v0Var) {
            DebugImage debugImage = new DebugImage();
            k3Var.Y();
            HashMap map = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "debug_file":
                        debugImage.debugFile = k3Var.O2();
                        break;
                    case "image_addr":
                        debugImage.imageAddr = k3Var.O2();
                        break;
                    case "image_size":
                        debugImage.imageSize = k3Var.E2();
                        break;
                    case "code_file":
                        debugImage.codeFile = k3Var.O2();
                        break;
                    case "arch":
                        debugImage.arch = k3Var.O2();
                        break;
                    case "type":
                        debugImage.type = k3Var.O2();
                        break;
                    case "uuid":
                        debugImage.uuid = k3Var.O2();
                        break;
                    case "debug_id":
                        debugImage.debugId = k3Var.O2();
                        break;
                    case "code_id":
                        debugImage.codeId = k3Var.O2();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        k3Var.U2(v0Var, map, strH1);
                        break;
                }
            }
            k3Var.h0();
            debugImage.setUnknown(map);
            return debugImage;
        }
    }

    public String getArch() {
        return this.arch;
    }

    public String getCodeFile() {
        return this.codeFile;
    }

    public String getCodeId() {
        return this.codeId;
    }

    public String getDebugFile() {
        return this.debugFile;
    }

    public String getDebugId() {
        return this.debugId;
    }

    public String getImageAddr() {
        return this.imageAddr;
    }

    public Long getImageSize() {
        return this.imageSize;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUuid() {
        return this.uuid;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.uuid != null) {
            l3Var.f("uuid").h(this.uuid);
        }
        if (this.type != null) {
            l3Var.f("type").h(this.type);
        }
        if (this.debugId != null) {
            l3Var.f("debug_id").h(this.debugId);
        }
        if (this.debugFile != null) {
            l3Var.f("debug_file").h(this.debugFile);
        }
        if (this.codeId != null) {
            l3Var.f("code_id").h(this.codeId);
        }
        if (this.codeFile != null) {
            l3Var.f("code_file").h(this.codeFile);
        }
        if (this.imageAddr != null) {
            l3Var.f("image_addr").h(this.imageAddr);
        }
        if (this.imageSize != null) {
            l3Var.f("image_size").k(this.imageSize);
        }
        if (this.arch != null) {
            l3Var.f("arch").h(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                l3Var.f(str).l(v0Var, this.unknown.get(str));
            }
        }
        l3Var.h0();
    }

    public void setArch(String str) {
        this.arch = str;
    }

    public void setCodeFile(String str) {
        this.codeFile = str;
    }

    public void setCodeId(String str) {
        this.codeId = str;
    }

    public void setDebugFile(String str) {
        this.debugFile = str;
    }

    public void setDebugId(String str) {
        this.debugId = str;
    }

    public void setImageAddr(String str) {
        this.imageAddr = str;
    }

    public void setImageSize(Long l15) {
        this.imageSize = l15;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public void setImageSize(long j15) {
        this.imageSize = Long.valueOf(j15);
    }
}
